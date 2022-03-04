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
@ApiModel(value = "数据汇聚数据传输储物柜")
public class SjhjcwgVO implements Serializable {
    private static final long serialVersionUID = -6627847754509227858L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("储物柜编码")
    private String cwgbh;
    @ApiModelProperty("储物柜名称")
    private String cwgmc;
    @ApiModelProperty("储物柜类型编码")
    private String cwglxbm;
    @ApiModelProperty("储物柜类型名称")
    private String cwglxmc;
    @ApiModelProperty("格子数量")
    private Integer gzsl;
    @ApiModelProperty("格子数量")
    private String ssbmbm;
    @ApiModelProperty("所属部门名称")
    private String ssbmmc;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;

}
