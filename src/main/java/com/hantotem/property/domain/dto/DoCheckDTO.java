package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author geekerstar
 * @date 2021/3/25 10:43
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DoCheckDTO", description = "开始盘点入参")
public class DoCheckDTO {

    @NotBlank(message = "操作编号不能为空")
    @ApiModelProperty(value = "操作编号", example = "C1374617457729343488")
    private String czbh;

    @NotBlank(message = "接收单位代码不能为空")
    @ApiModelProperty(value = "接收单位代码，当前的涉案财物中心单位代码",example = "1231231231")
    private String jsdwdm;

    @NotBlank(message = "接收单位名称不能为空")
    @ApiModelProperty(value = "接收单位名称，当前的涉案财物中心单位代码",example = "昆明涉案财物中心")
    private String jsdwmc;

    @NotBlank(message = "当前登录人不能为空")
    @ApiModelProperty(value = "当前登录人", example = "张三")
    private String dlr;

    @NotBlank(message = "当前登录人民警编号不能为空")
    @ApiModelProperty(value = "当前登录人民警编号", example = "0123452")
    private String dlrmjbh;
}
