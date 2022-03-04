package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author geekerstar
 * @date 2021/3/31 11:37
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "OssUploadVO", description = "对象存储文件上传出参")
public class OssUploadVO {

    @ApiModelProperty("文件访问URL")
    private String url;

    @ApiModelProperty("文件名称")
    private String name;
}
