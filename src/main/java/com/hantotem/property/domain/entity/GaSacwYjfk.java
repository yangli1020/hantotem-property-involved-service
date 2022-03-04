package com.hantotem.property.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.*;
import lombok.Data;

/**
 * (GaSacwYjfk)实体类
 *
 * @author geekerstar
 * @since 2021-03-25 18:29:46
 */
@Data
@ApiModel("$tableInfo.comment")
public class GaSacwYjfk implements Serializable {

    private static final long serialVersionUID = -71090698799295821L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("问题描述")
    private String wtms;

    @ApiModelProperty("问题截图")
    private String wtjt;

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
