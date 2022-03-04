package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 案件检索 DTO
 * @since 2021/3/23 10:11
 */
@Data
@ApiModel(value = "AjxxSearchDTO", description = "案件检索 DTO")
public class AjxxSearchDTO implements Serializable {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("案件主办单位")
    private String ajzbdw;

    @ApiModelProperty("案件类型")
    private String ajlx;

    @ApiModelProperty("案件类别")
    private String ajlb;

    @ApiModelProperty("办案人")
    private String bar;

    @ApiModelProperty("办案人民警编号")
    private String barmjbh;

    @ApiModelProperty("简要案情")
    private String jyaq;

    @ApiModelProperty("录入时间")
    private String rksj;

    @ApiModelProperty("受案时间")
    private String slsj;
}
