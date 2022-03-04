package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "数据汇聚数据传输盘库明细")
public class SjhjpkmxVO implements Serializable {
    private static final long serialVersionUID = 5034382169260388601L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("物品名称")
    private String wpmc;
    @ApiModelProperty("物品编号")
    private String wpbh;
    @ApiModelProperty("操作编号")
    private String czbh;
    @ApiModelProperty("案件编号")
    private String ajbh;
    @ApiModelProperty("案件名称")
    private String ajmc;
    @ApiModelProperty("物品状态编码")
    private String wpztbm;
    @ApiModelProperty("核实状态编码")
    private String hsztbm;
    @ApiModelProperty("物品操作状态编码")
    private String wpczztbm;
    @ApiModelProperty("所属部门编码")
    private String ssbmbm;
    @ApiModelProperty("所属部门名称")
    private String ssbmmc;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;
    @ApiModelProperty("存放位置")
    private String cfwz;


}
