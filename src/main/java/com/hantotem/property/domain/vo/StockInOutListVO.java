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
 * @date 2021/3/30 15:28
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "StockInOutViewVO", description = "物品出入库情况列表")
public class StockInOutListVO {

    @ApiModelProperty("序号")
    private Integer xh;

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

    @ApiModelProperty("送取人民警编号")
    private String sqrmjbh;

    @ApiModelProperty("送取人")
    private String sqr;

    @ApiModelProperty("送取人联系方式")
    private String sqrlxfs;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @ApiModelProperty("物品唯一uuid")
    private String wpbh;

    @ApiModelProperty("存最新的")
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

    @ApiModelProperty("是否预警")
    private Integer sfyj;

    @ApiModelProperty("物品状态大类代码(1.在库/2.出库)")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类(1.在库/2.出库)")
    private String wpztdl;

    @ApiModelProperty("物品状态小类代码(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxldm;

    @ApiModelProperty("物品状态小类(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxl;

    @ApiModelProperty("接收单位代码")
    private String jsdwdm;

    @ApiModelProperty("接收单位")
    private String jsdw;

    @ApiModelProperty("最新入库时间")
    private LocalDateTime zxrksj;

    @ApiModelProperty("最新出库时间")
    private LocalDateTime zxcksj;

    @ApiModelProperty("签字时间(出入库时间)")
    private LocalDateTime qzsj;

    @ApiModelProperty("移交单位代码/送取人所属单位代码")
    private String sqrssdwdm;

    @ApiModelProperty("移交单位/送取人所属单位")
    private String sqrssdw;
}
