package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @author geekerstar
 * @date 2021/3/22 17:10
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CaseInfoDTO", description = "案件信息关联入参")
public class CaseInfoDTO {

    @NotBlank(message = "案件编号不能为空")
    @ApiModelProperty(value = "案件编号",example = "A013231456876912876")
    private String ajbh;

    @NotBlank(message = "案件名称不能为空")
    @ApiModelProperty(value = "案件名称",example = "王明明盗窃案")
    private String ajmc;

    @ApiModelProperty(value = "案件主办单位代码",example = "11111111")
    private String ajzbdwdm;

    @ApiModelProperty(value = "案件主办单位",example = "昆明市公安局西山分局金家河派出所")
    private String ajzbdw;

    @ApiModelProperty(value = "案件类型",example = "刑侦案件")
    private String ajlx;

    @ApiModelProperty(value = "案件类型代码",example = "1")
    private String ajlxdm;

    @ApiModelProperty(value = "案件类别",example = "入室盗窃")
    private String ajlb;

    @ApiModelProperty(value = "案件类别代码",example = "2")
    private String ajlbdm;

    @ApiModelProperty(value = "发案时间",example = "2020-01-01 12:12:12")
    private LocalDateTime fasj;

    @ApiModelProperty(value = "受理时间",example = "2020-02-02 12:11:32")
    private LocalDateTime slsj;

    @ApiModelProperty(value = "办案人",example = "张三")
    private String bar;

    @ApiModelProperty(value = "办案人民警编号",example = "0123452")
    private String barmjbh;

    @NotBlank(message = "当前登录人不能为空")
    @ApiModelProperty(value = "当前登录人",example = "张三")
    private String dlr;

    @NotBlank(message = "当前登录人民警编号不能为空")
    @ApiModelProperty(value = "当前登录人民警编号",example = "0123452")
    private String dlrmjbh;
}
