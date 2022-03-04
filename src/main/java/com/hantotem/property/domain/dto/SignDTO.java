package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author geekerstar
 * @date 2021/3/23 15:24
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "SignDTO", description = "签字入参")
public class SignDTO {

    @NotNull(message = "操作类型不能为空")
    @ApiModelProperty(value = "操作类型，入库传1，出库传2", example = "1")
    private Integer czlx;

//    @NotBlank(message = "送取人签字图片地址不能为空")
    @ApiModelProperty(value = "送取人签字图片地址", example = "签字图片JSON")
    private String sqrqz;

//    @NotBlank(message = "送取人民警编号不能为空")
    @ApiModelProperty(value = "送取人民警编号", example = "111111")
    private String sqrmjbh;

    @NotBlank(message = "送取人不能为空")
    @ApiModelProperty(value = "送取人", example = "张三")
    private String sqr;

    @NotBlank(message = "送取人联系方式不能为空")
    @ApiModelProperty(value = "送取人联系方式", example = "18227663923")
    private String sqrlxfs;

    @NotBlank(message = "送取人所属单位代码不能为空")
    @ApiModelProperty(value = "送取人所属单位代码", example = "12312313123")
    private String sqrssdwdm;

    @NotBlank(message = "送取人所属单位不能为空")
    @ApiModelProperty(value = "送取人所属单位", example = "法制支队")
    private String sqrssdw;

    @ApiModelProperty(value = "文书地址", example = "文书地址JSON")
    private String wsdz;

    @ApiModelProperty(value = "案件编号", example = "A013231456876912876")
    private String ajbh;

    @NotBlank(message = "操作编号不能为空")
    @ApiModelProperty(value = "操作编号", example = "C1374617457729343488")
    private String czbh;

    @NotBlank(message = "当前登录人不能为空")
    @ApiModelProperty(value = "当前登录人", example = "张三")
    private String dlr;

    @NotBlank(message = "当前登录人民警编号不能为空")
    @ApiModelProperty(value = "当前登录人民警编号", example = "0123452")
    private String dlrmjbh;

    @NotBlank(message = "当前登录人单位不能为空")
    @ApiModelProperty(value = "当前登录人单位", example = "派出所")
    private String dlrdw;

    @NotBlank(message = "当前登录人单位代码不能为空")
    @ApiModelProperty(value = "当前登录人单位代码", example = "0123452")
    private String dlrdwdm;

    @NotEmpty(message = "物品编号列表不能为空")
    @ApiModelProperty(value = "物品编号列表")
    private List<String> wpbhList;
}
