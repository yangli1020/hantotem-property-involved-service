package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 物品详情 DTO
 * @since 2021/3/25 11:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "WpxqDTO", description = "物品详情 DTO")
public class WpxqSearchDTO implements Serializable {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("物品编号")
    private String wpbh;

    @ApiModelProperty("物品标签id,用最新的")
    private String wprfid;

    @ApiModelProperty("物品名称")
    private String wpmc;

    @ApiModelProperty("物品描述")
    private String wpms;

    @ApiModelProperty("数量")
    private String sl;

    @ApiModelProperty("计量单位")
    private String jldw;

    @ApiModelProperty("实物图地址")
    private String swtdz;

    @ApiModelProperty("物品种类")
    private String wpzl;

    @ApiModelProperty("存放区域")
    private String cfqy;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("物品类型代码")
    private String wplxdm;

    @ApiModelProperty("物品类型")
    private String wplx;

    @ApiModelProperty("物品状态(1.在库/2.出库/5.异常出库)")
    private String wpztdm;

    @ApiModelProperty("物品状态(1.在库/2.出库/5.异常出库)")
    private String wpzt;

    @ApiModelProperty("物品状态大类代码(1.在库/2.出库)")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类(1.在库/2.出库)")
    private String wpztdl;

    @ApiModelProperty("物品状态小类代码(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxldm;

    @ApiModelProperty("物品状态小类(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxl;

    @ApiModelProperty("柜端状态代码(1.待入库/2.已入库库/3.待出库/4.已出库)")
    private String gdztdm;

    @ApiModelProperty("柜端状态名称(1.待入库/2.已入库库/3.待出库/4.已出库)")
    private String gdztmc;

    @ApiModelProperty("序号")
    private Integer index;
}
