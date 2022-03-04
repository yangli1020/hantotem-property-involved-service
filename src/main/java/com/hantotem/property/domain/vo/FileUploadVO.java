package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author geekerstar
 * @date 2021/3/24 16:25
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "FileUploadVO", description = "文件上传出参")
public class FileUploadVO {

    @ApiModelProperty(value = "url",example = "http://192.168.1.203:9999/group1/86501729/1.ass?name=1.ass&download=1")
    private String url;

    @ApiModelProperty(value = "md5",example = "d59b3bb9b0680dcc21596c7b5ea5d1c5")
    private String md5;

    @ApiModelProperty(value = "path",example = "/group1/86501729/1.ass")
    private String path;

    @ApiModelProperty(value = "domain",example = "http://192.168.1.203:9999")
    private String domain;

    @ApiModelProperty(value = "scene",example = "default")
    private String scene;

    @ApiModelProperty(value = "size",example = "850")
    private String size;

    @ApiModelProperty(value = "mtime",example = "1616574272")
    private String mtime;

    @ApiModelProperty(value = "scenes",example = "default")
    private String scenes;

    @ApiModelProperty(value = "retmsg",example = "")
    private String retmsg;

    @ApiModelProperty(value = "retcode",example = "0")
    private String retcode;

    @ApiModelProperty(value = "src",example = "/group1/86501729/1.ass")
    private String src;

}
