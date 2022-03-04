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
 * @date 2021/3/23 09:33
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ItemSaveDTO", description = "保存物品入参")
public class ItemSaveDTO {

    @NotBlank(message = "案件编号不能为空")
    @ApiModelProperty(value = "案件编号", example = "A013231456876912876")
    private String ajbh;

    @NotBlank(message = "案件名称不能为空")
    @ApiModelProperty(value = "案件名称", example = "王明明盗窃案")
    private String ajmc;

    @NotBlank(message = "案件主办单位代码不能为空")
    @ApiModelProperty(value = "案件主办单位代码", example = "11111111")
    private String ajzbdwdm;

    @NotBlank(message = "案件主办单位不能为空")
    @ApiModelProperty(value = "案件主办单位", example = "昆明市公安局西山分局金家河派出所")
    private String ajzbdw;

//    @NotBlank(message = "送取人民警编号不能为空") 先毙掉，目前实现为：不是民警的人员也能取件
    @ApiModelProperty(value = "送取人民警编号", example = "032111")
    private String sqrmjbh;

    @NotBlank(message = "送取人不能为空")
    @ApiModelProperty(value = "送取人", example = "张三")
    private String sqr;

    @NotBlank(message = "送取人所属单位代码不能为空")
    @ApiModelProperty(value = "送取人所属单位代码", example = "11111111")
    private String sqrssdwdm;

    @NotBlank(message = "送取人所属单位不能为空")
    @ApiModelProperty(value = "送取人所属单位", example = "昆明盘龙区督察一大队")
    private String sqrssdw;

    @ApiModelProperty(value = "送取人联系方式",example = "165283728937")
    private String sqrlxfs;

    @NotBlank(message = "操作编号不能为空")
    @ApiModelProperty(value = "操作编号", example = "C1374617457729343488")
    private String czbh;

    @ApiModelProperty(value = "物品RFID", example = "123123123123")
    private String wprfid;

    @ApiModelProperty(value = "物品唯一uuid，新增的时候不传或传空，编辑的时候才传值",example = "W123123123")
    private String wpbh;

    @NotBlank(message = "物品名称不能为空")
    @ApiModelProperty(value = "物品名称", example = "手机")
    private String wpmc;

    @NotBlank(message = "物品种类代码不能为空")
    @ApiModelProperty(value = "物品种类代码", example = "12")
    private String wpzldm;

    @NotBlank(message = "物品种类不能为空")
    @ApiModelProperty(value = "物品种类", example = "通讯设备")
    private String wpzl;

    @NotBlank(message = "物品类型代码不能为空")
    @ApiModelProperty(value = "物品类型代码", example = "22")
    private String wplxdm;

    @NotBlank(message = "物品类型不能为空")
    @ApiModelProperty(value = "物品类型", example = "一般物品")
    private String wplx;

    @ApiModelProperty(value = "物品描述", example = "OPPO，蓝色，号码13900001111")
    private String wpms;

    @NotBlank(message = "数量不能为空")
    @ApiModelProperty(value = "数量", example = "1")
    private String sl;

    @NotBlank(message = "计量单位代码不能为空")
    @ApiModelProperty(value = "计量单位代码", example = "32")
    private String jldwdm;

    @NotBlank(message = "计量单位不能为空")
    @ApiModelProperty(value = "计量单位", example = "个")
    private String jldw;

    @ApiModelProperty(value = "实物图地址", example = "json字符串")
    private String swtdz;

    @NotBlank(message = "存放区域代码不能为空")
    @ApiModelProperty(value = "存放区域代码", example = "44")
    private String cfqydm;

    @NotBlank(message = "存放区域不能为空")
    @ApiModelProperty(value = "存放区域", example = "货架")
    private String cfqy;

    @NotBlank(message = "具体位置不能为空")
    @ApiModelProperty(value = "具体位置", example = "A1-1-2")
    private String jtwz;

    @NotBlank(message = "接收单位代码不能为空")
    @ApiModelProperty(value = "接收单位代码", example = "11111111(当前登录人单位代码)")
    private String jsdwdm;

    @NotBlank(message = "接收单位不能为空")
    @ApiModelProperty(value = "接收单位", example = "西山区涉案财物中心(当前登录人单位)")
    private String jsdw;

    @NotBlank(message = "当前登录人不能为空")
    @ApiModelProperty(value = "当前登录人",example = "张三")
    private String dlr;

    @NotBlank(message = "当前登录人民警编号不能为空")
    @ApiModelProperty(value = "当前登录人民警编号",example = "0123452")
    private String dlrmjbh;
}
