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
 * @date 2021/5/12 09:55
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "StockOutCaseSearchVO", description = "出库案件检索列表")
public class StockOutCaseSearchVO {

    @ApiModelProperty("序号")
    private Integer xh;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("案件类型")
    private String ajlx;

    @ApiModelProperty("案件类型代码")
    private String ajlxdm;

    @ApiModelProperty("案件类别")
    private String ajlb;

    @ApiModelProperty("案件类别代码")
    private String ajlbdm;

    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("案件主办单位")
    private String ajzbdw;

    @ApiModelProperty("办案人")
    private String bar;

    @ApiModelProperty("办案人民警编号")
    private String barmjbh;

    @ApiModelProperty("涉案物品")
    private String sawp;

    @ApiModelProperty("物品描述")
    private String wpms;

    @ApiModelProperty("存放位置")
    private String cfwz;

    @ApiModelProperty("更新时间")
    private LocalDateTime gxsj;

}
