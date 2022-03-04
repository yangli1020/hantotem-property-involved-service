package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author geekerstar
 * @date 2021/3/23 15:06
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DocumentAddDTO", description = "文书上传入参")
public class DocumentAddDTO {

    @NotBlank(message = "案件编号不能为空")
    @ApiModelProperty("案件编号")
    private String ajbh;

    @NotBlank(message = "案件名称不能为空")
    @ApiModelProperty("案件名称")
    private String ajmc;

    @NotBlank(message = "案件主办单位代码不能为空")
    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @NotBlank(message = "案件主办单位不能为空")
    @ApiModelProperty("案件主办单位")
    private String ajzbdw;

    @NotBlank(message = "操作编号不能为空")
    @ApiModelProperty("操作编号")
    private String czbh;

    @NotBlank(message = "文书地址不能为空")
    @ApiModelProperty("文书地址")
    private String wsdz;

    @NotNull(message = "文书类型不能为空")
    @ApiModelProperty("文书类型1-入库文书；2-领取文书")
    private Integer wslx;

    @NotBlank(message = "当前登录人不能为空")
    @ApiModelProperty(value = "当前登录人",example = "张三")
    private String dlr;

    @NotBlank(message = "当前登录人民警编号不能为空")
    @ApiModelProperty(value = "当前登录人民警编号",example = "0123452")
    private String dlrmjbh;
}
