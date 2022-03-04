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
@ApiModel(value = "数据汇聚数据传输案件")
public class SjhjajVO implements Serializable {

    private static final long serialVersionUID = -4910383969125644592L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("案件编号")
    private String ajbh;
    @ApiModelProperty("案件名称")
    private String ajmc;
    @ApiModelProperty("警情编号")
    private String jqbh;
    @ApiModelProperty("接处警编号")
    private String jcjbh;
    @ApiModelProperty("案件类型编码(27)")
    private String ajlxbm;
    @ApiModelProperty("报警时间")
    private Date bjsj;
    @ApiModelProperty("发案时间初值")
    private Date fasjcz;
    @ApiModelProperty("发案时间终值")
    private Date fasjzz;
    @ApiModelProperty("发案地点详址")
    private String fadd;
    @ApiModelProperty("主要案情/简要案情")
    private String zyaq;
    @ApiModelProperty("受案时间")
    private Date sasj;
    @ApiModelProperty("立案日期")
    private Date lasj;
    @ApiModelProperty("主办单位编码")
    private String babmbm;
    @ApiModelProperty("主办单位名称")
    private String babmmc;
    @ApiModelProperty("案件主要办案人编码")
    private String ajzbrybm;
    @ApiModelProperty("案件主要办案人名称")
    private String ajzbrymc;
    @ApiModelProperty("案件协办人编码（多人）")
    private String ajxbrybm;
    @ApiModelProperty("案件协办人名称（多人）")
    private String ajxbrymc;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;
    @ApiModelProperty("案件类别名称（无编码）")
    private String ajlbmc;


}
