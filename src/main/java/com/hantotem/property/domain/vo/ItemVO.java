package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author geekerstar
 * @date 2021/3/23 14:06
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ItemVO", description = "物品登记列表")
public class ItemVO {

    @ApiModelProperty("序号")
    private Integer xh;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("送取人民警编号")
    private String sqrmjbh;

    @ApiModelProperty("送取人")
    private String sqr;

    @ApiModelProperty("送取人联系方式")
    private String sqrlxfs;

    @ApiModelProperty("送取人所属单位代码")
    private String sqrssdwdm;

    @ApiModelProperty("送取人所属单位")
    private String sqrssdw;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @ApiModelProperty("物品唯一uuid")
    private String wpbh;

    @ApiModelProperty("物品RFID")
    private String wprfid;

    @ApiModelProperty("物品名称")
    private String wpmc;

    @ApiModelProperty("物品种类代码")
    private String wpzldm;

    @ApiModelProperty("物品种类")
    private String wpzl;

    @ApiModelProperty("物品类型代码")
    private String wplxdm;

    @ApiModelProperty("物品类型")
    private String wplx;

    @ApiModelProperty("物品描述")
    private String wpms;

    @ApiModelProperty("数量")
    private String sl;

    @ApiModelProperty("计量单位代码")
    private String jldwdm;

    @ApiModelProperty("计量单位")
    private String jldw;

    @ApiModelProperty("实物图地址")
    private String swtdz;

    @ApiModelProperty("存放区域代码")
    private String cfqydm;

    @ApiModelProperty("存放区域")
    private String cfqy;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("物品状态大类代码")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类")
    private String wpztdl;

    @ApiModelProperty("物品状态小类代码")
    private String wpztxldm;

    @ApiModelProperty("物品状态小类")
    private String wpztxl;

    @ApiModelProperty("最新入库时间")
    private LocalDateTime zxrksj;
}
