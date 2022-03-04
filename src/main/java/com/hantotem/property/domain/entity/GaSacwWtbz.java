package com.hantotem.property.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.*;
import lombok.Data;

/**
 * 问题帮助表(GaSacwWtbz)实体类
 *
 * @author geekerstar
 * @since 2021-03-25 18:29:47
 */
@Data
@ApiModel("问题帮助表")
public class GaSacwWtbz implements Serializable {

    private static final long serialVersionUID = -21868745049755089L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("问题描述")
    private String wtms;

    @ApiModelProperty("解答文本描述")
    private String jdms;

    @ApiModelProperty("操作手册视频url")
    private String czsc;

    @ApiModelProperty("搜索次数")
    private Integer sscs;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建人编号")
    private String createdCode;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("更新人")
    private String updatedBy;

    @ApiModelProperty("更新人编号")
    private String updatedCode;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

    @ApiModelProperty("状态")
    private Integer state;


}
