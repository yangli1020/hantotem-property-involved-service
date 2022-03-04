package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description
 * @since 2021/3/24 15:38
 */
@Data
@ApiModel(value = "SearchWpxxVO", description = "检索物品信息时的 VO")

public class SearchWpxxVO implements Serializable {
    @Min(value = 1L, message = "必须大于 0")
    @ApiModelProperty("当前页数【默认为 1】")
    private Integer current;

    @Min(value = 1L, message = "必须大于 0")
    @Max(value = 200L, message = "必须小于 200")
    @ApiModelProperty("每页多少【默认为 10】")
    private Integer size;

    @ApiModelProperty("更新时间开始")
    @DateTimeFormat(pattern = "yyyy-MM-dd",iso = DateTimeFormat.ISO.DATE)
    private Date start;

    @ApiModelProperty("更新时间结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd",iso = DateTimeFormat.ISO.DATE)
    private Date end;

    @ApiModelProperty("物品状态（全部:-1【默认】、 在库:1、 出库:2）")
    private String wpztdldm;

    @ApiModelProperty("是否异常（全部:-1【默认】、 是:5、 否:4）")
    private Integer sfyc;

    @ApiModelProperty("搜索条件")
    private String query;

    @ApiModelProperty("接收单位代码")
    @NotBlank
    private String jsdwdm;

    @ApiModelProperty("物品编号")
    private String wpbh;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件类型（全部:-1【默认】，11:行政案件，-2：非行政案件）")
    private String ajlxdm;

    @ApiModelProperty("案件类别（全部:-1【默认】）")
    private String ajlbdm;

    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("物品存放区域(全部：-1【默认】,1:货架区,2:物管柜区,3:防磁柜区,4:防腐柜区,5:密码柜区)")
    private String cfqy;
}
