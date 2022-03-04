package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 物品分页查询 VO
 * @since 2021/4/14 10:00
 */
@Data
@Builder
@ApiModel("物品分页查询 VO")
@NoArgsConstructor
@AllArgsConstructor
public class WpPageQueryVO implements Serializable {
    @ApiModelProperty("数据偏移")
    private Integer offset;

    @ApiModelProperty("每页多少")
    private Integer size;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("物品状态大类代码")
    private String wpztdldm;

    @ApiModelProperty("是否异常")
    private Integer sfyc;

    @ApiModelProperty("时间开始")
    private Date start;

    @ApiModelProperty("时间结束")
    private Date end;

    @ApiModelProperty("搜索条件")
    private String query;

    @ApiModelProperty("接收单位代码")
    private String jsdwdm;

    @ApiModelProperty("其他数组类型")
    private String[] array;

    @ApiModelProperty("案件类型（全部:-1【默认】）")
    private String ajlxdm;

    @ApiModelProperty("案件类别（全部:-1【默认】）")
    private String ajlbdm;

    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("物品存放区域(全部：-1【默认】,1:货架区,2:物管柜区,3:防磁柜区,4:防腐柜区,5:密码柜区)")
    private String cfqy;
}
