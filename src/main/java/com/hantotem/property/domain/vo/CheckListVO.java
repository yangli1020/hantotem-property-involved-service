package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author geekerstar
 * @date 2021/3/25 15:12
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CheckListVO", description = "盘库明细列表出参")
public class CheckListVO {

    @ApiModelProperty("序号")
    private Integer xh;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("物品名称")
    private String wpmc;

    @ApiModelProperty("物品唯一uuid")
    private String wpbh;

    @ApiModelProperty("物品rfid")
    private String wprfid;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("数量")
    private String sl;

    @ApiModelProperty("计量单位代码")
    private String jldwdm;

    @ApiModelProperty("计量单位")
    private String jldw;

    @ApiModelProperty("实物图地址")
    private String swtdz;

    @ApiModelProperty("存放区域")
    private String cfqy;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("物品状态(1.正常/2.校验正常/3.异常-少件/4.异常-多件/5.盘点登记出库/6.盘点登记入库)")
    private Integer wpzt;

    @ApiModelProperty("核实状态(1.无需核实/2.已核实/3.未核实)")
    private Integer hszt;

    @ApiModelProperty("核对状态(1.标记正常/2.登记入库/3.登记出库)")
    private Integer hdzt;

    @ApiModelProperty("异常类型(1.少件/2.多件)")
    private Integer yclx;

    @ApiModelProperty("所属单位编码")
    private String ssdwdm;

    @ApiModelProperty("所属单位名称")
    private String ssdwmc;

}
