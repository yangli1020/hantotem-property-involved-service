package com.hantotem.property.common;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.hantotem.property.domain.common.Response;
import com.hantotem.property.domain.dto.OssBucketPolicyConfigDTO;
import com.hantotem.property.domain.vo.OssUploadVO;
import io.minio.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author geekerstar
 * @date 2021/3/31 11:35
 * @description
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/oss")
@Api(tags = "对象存储-魏星-20210331")
@RequiredArgsConstructor
public class OssController {

    @Value("${minio.endpoint}")
    private String endpoint;
    @Value("${minio.accessKey}")
    private String accessKey;
    @Value("${minio.secretKey}")
    private String secretKey;

    @PostMapping("/upload")
    @ApiOperation(value = "单文件上传-魏星-20210324", notes = "http://192.168.1.232:18500/，用户名：minioadmin，密码：minioadmin")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "file", value = "文件", paramType = "query", required = true, dataType = "__File"),
            @ApiImplicitParam(name = "bucket", value = "存储桶(3到63个字符)，文书传document，签字传sign，实物图传picture", required = true, defaultValue = "default")
    })
    public Response<OssUploadVO> upload(
            @RequestParam(value = "file") MultipartFile file,
            @Length(min = 3, max = 63, message = "存储桶名必须大于等于3个字符，小于等于63个字符") @RequestParam(value = "bucket") String bucket
    ) {
        try {
            MinioClient minioClient = MinioClient.builder()
                    .endpoint(endpoint)
                    .credentials(accessKey, secretKey)
                    .build();
            System.out.println(minioClient.toString());
            boolean isExist = minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucket).build());
            log.info("它执行到了存在与否的判断:{}",isExist);
            if (isExist) {
                log.debug("存储桶已经存在！");
            } else {
                //创建存储桶并设置只读权限
                log.info("创建存储桶");
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucket).build());
                OssBucketPolicyConfigDTO bucketPolicyConfigDto = createBucketPolicyConfigDto(bucket);
                SetBucketPolicyArgs setBucketPolicyArgs = SetBucketPolicyArgs.builder()
                        .bucket(bucket)
                        .config(JSONUtil.toJsonStr(bucketPolicyConfigDto))
                        .build();
                minioClient.setBucketPolicy(setBucketPolicyArgs);
            }
            String filename = file.getOriginalFilename();
            log.info("文件名称{}",filename);
            String type = file.getContentType();
            log.info("文件编码{}",type);
            String objectName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + "/" + filename;
            log.info("最终存储桶存放文件名称{}",objectName);
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .bucket(bucket)
                    .object(objectName)
                    .contentType(file.getContentType())
                    .stream(file.getInputStream(), file.getSize(), ObjectWriteArgs.MIN_MULTIPART_SIZE).build();
            System.out.println("生成的文件流参数:" + putObjectArgs.toString());
            minioClient.putObject(putObjectArgs);
            return Response.success(OssUploadVO.builder().url(endpoint + "/" + bucket + "/" + objectName).name(filename).build());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("上传发生错误: {}！", e.getMessage());
        }
        return Response.failed();
    }

    private OssBucketPolicyConfigDTO createBucketPolicyConfigDto(String bucketName) {
        OssBucketPolicyConfigDTO.Statement statement = OssBucketPolicyConfigDTO.Statement.builder()
                .effect("Allow")
                .principal("*")
                .action("s3:GetObject")
                .resource("arn:aws:s3:::" + bucketName + "/*.**").build();
        return OssBucketPolicyConfigDTO.builder()
                .version("2012-10-17")
                .statement(CollUtil.toList(statement))
                .build();
    }

    @PostMapping("/delete")
    @ApiOperation(value = "单文件删除-魏星-20210324", notes = "http://192.168.1.203:18500/，用户名：minioadmin，密码：minioadmin")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fileName", value = "文件名(这里需要带上日期，如20210331/111.jpg)", required = true),
            @ApiImplicitParam(name = "bucket", value = "存储桶(3到63个字符)，文书传document，签字传sign，实物图传picture", required = true, defaultValue = "default")
    })
    public Response<String> delete(
            @RequestParam("fileName") String fileName,
            @Length(min = 3, max = 63, message = "存储桶名必须大于等于3个字符，小于等于63个字符") @RequestParam(value = "bucket") String bucket
    ) {
        try {
            MinioClient minioClient = MinioClient.builder()
                    .endpoint(endpoint)
                    .credentials(accessKey, secretKey)
                    .build();
            minioClient.removeObject(RemoveObjectArgs.builder().bucket(bucket).object(fileName).build());
            return Response.success();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.failed();
    }
}
