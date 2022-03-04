package com.hantotem.property.controller.rlkgl;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.hantotem.property.common.OssController;
import com.hantotem.property.domain.common.Response;
import com.hantotem.property.domain.entity.GaSacwYhgl;
import com.hantotem.property.domain.vo.AddPhotoVO;
import com.hantotem.property.domain.vo.OssUploadVO;
import com.hantotem.property.domain.vo.SearchVO;
import com.hantotem.property.domain.vo.UserUpdateVO;
import com.hantotem.property.exception.CommonException;
import com.hantotem.property.service.RlkglService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Slf4j
@Api("人脸库管理--YL")
@RestController
@RequestMapping("/rlk")
@RequiredArgsConstructor
public class RlkglController extends OssController {


    private final RlkglService rlkglService;


    @PostMapping("/findBysfzhAndjybh")
    @ApiOperation(value = "根据身份证号或警号查询人员信息", tags = "根据身份证号或警号查询人员信息")
    public Response<List<GaSacwYhgl>> findBysfzhAndjybh(String no){
        List<GaSacwYhgl> bysfzhAndjybh = rlkglService.findBysfzhAndjybh(no);
        return Response.success(bysfzhAndjybh);
    }



    @PostMapping("/deleteRyByjh")
    @ApiOperation(value = "根据id删除人员信息的照片", tags = "根据id删除人员信息的照片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", paramType = "query", dataType = "string", required = true)
    })
    public Response<Boolean> deleteRyByjybh( @RequestParam Long id,@RequestParam String bucket,@RequestParam String filename){
        //删除云端上的图片信息
        //http://192.168.1.202:18500/rltp/20220304/asdasfasd.jpg
        String replace = filename.replace("http://192.168.1.202:18500/rltp/", "");
        Response<String> rltp = delete(replace, bucket);
        rlkglService.deleteRyByjybh(id);
        return Response.success(true);
    }

    @PostMapping("/updateByJh")
    @ApiOperation(value = "根据警号修改人脸照片", tags = "根据警号修改人脸照片")
    public Response<String> updateByJh(@RequestParam Long id,@RequestParam MultipartFile file){
        if (id==null) {
            log.info("用户 ID 不能为空");
            throw CommonException.PARAM_ERROR;
        }
        GaSacwYhgl byId = rlkglService.getById(id);
        String rlzpURL = byId.getRlzp();
        delete(rlzpURL,"rltp");
        Response<OssUploadVO> updateRltp = upload(file, "rltp");
        OssUploadVO results = updateRltp.getResults();
        String url = results.getUrl();
        rlkglService.savePhoto(id,url);
        return Response.success();



    }
    @PostMapping("/addRyxx")
    @ApiOperation(value = "添加人员信息的人脸照片", tags = "添加人员信息的人脸照片")
    public Response<String> addRyxx(@RequestParam Long id,@RequestParam("file") MultipartFile file) throws IOException {
        if (id==null) {
            log.info("用户 ID 不能为空");
            throw CommonException.PARAM_ERROR;
        }
        /*String originalFilename= file.getOriginalFilename();
        //获取文件后缀
        String substring = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        log.info("文件后缀名");
        String stringFile = UUID.randomUUID().toString();
        //拼接完整的文件名字*/
        Response<OssUploadVO> rltp = upload(file, "rltp");
        OssUploadVO results = rltp.getResults();
        String url = results.getUrl();
        rlkglService.savePhoto(id,url);
        return Response.success();
    }

}
