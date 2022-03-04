package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 案件查询 VO
 * @since 2021/4/14 18:22
 */
@Data
@ApiModel(value = "AjQueryVO", description = "案件查询 VO")
public class AjQueryVO {
    @ApiModelProperty(value = "当前页", required = true)
    @NotNull
    private Integer current;

    @ApiModelProperty(value = "每页多少", required = true)
    @NotNull
    private Integer size;

    @ApiModelProperty("时间开始")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private Date start;

    @ApiModelProperty("时间结束")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private Date end;

    @ApiModelProperty(value = "主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty(value = "案件类型,行政11，刑事21")
    private String ajlxdm;

    @ApiModelProperty(value = "所属单位代码")
    private String ssdwdm;

    @ApiModelProperty("搜索条件")
    private String query;

    @ApiModelProperty("状态")
    private Integer state;
}
