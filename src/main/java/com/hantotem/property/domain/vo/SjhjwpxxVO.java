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
@ApiModel(value = "数据汇聚数据传输物品信息")
public class SjhjwpxxVO implements Serializable {
    private static final long serialVersionUID = -1061406481492803057L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("物品编号")
    private String wpbh;
    @ApiModelProperty("案件编号")
    private String ajbh;
    @ApiModelProperty("案件名称")
    private String ajmc;
    @ApiModelProperty("主办单位编码")
    private String babmbm;
    @ApiModelProperty("主办单位名称")
    private String babmmc;
    @ApiModelProperty("标签编号")
    private String bqid;
    @ApiModelProperty("物品名称")
    private String wpmc;
    @ApiModelProperty("物品类型编码（21）")
    private String wplxbm;
    @ApiModelProperty("价值类型编码（201）")
    private String jzlxbm;
    @ApiModelProperty("物品描述")
    private String wpms;
    @ApiModelProperty("物品数量")
    private String wpsl;
    @ApiModelProperty("物品计量单位名称（无编码）")
    private String wpjldwmc;
    @ApiModelProperty("物品图片地址，多个使用逗号分隔")
    private String wptpdz;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;

}
