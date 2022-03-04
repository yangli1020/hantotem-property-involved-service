package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 搜索时返回的 物品信息 实体类
 * @since 2021/3/22 17:10
 */
@Data
@ApiModel("物品信息搜索 DTO")
@NoArgsConstructor
@AllArgsConstructor
public class WpxxSearchDTO implements Serializable {

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("案件类型代码")
    private String ajlxdm;

    @ApiModelProperty("案件类型")
    private String ajlx;

    @ApiModelProperty("案件类别代码")
    private String ajlbdm;

    @ApiModelProperty("案件类别")
    private String ajlb;

    @ApiModelProperty("主办单位")
    private String ajzbdw;

    @ApiModelProperty("主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("办案人")
    private String bar;

    @ApiModelProperty("涉案物品")
    private String sawp;

    @ApiModelProperty("物品编号")
    private String wpbh;

    @ApiModelProperty("物品描述")
    private String wpms;

    @ApiModelProperty("物品状态")
    private String wpzt;

    @ApiModelProperty("柜端状态代码")
    private String gdztdm;

    @ApiModelProperty("柜端状态名称")
    private String gdztmc;

    @ApiModelProperty("存放位置")
    private String cfwz;

    @ApiModelProperty("数量")
    private String sl;

    @ApiModelProperty("计量单位")
    private String jldw;

    @ApiModelProperty("是否异常")
    private String sfyc;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

    @ApiModelProperty("序号")
    private Integer index;
}
