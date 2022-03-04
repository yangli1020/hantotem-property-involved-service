package com.hantotem.property.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.annotations.*;
import lombok.Data;

/**
 * 码表(GaSacwMb)实体类
 *
 * @author geekerstar
 * @since 2021-03-25 09:40:31
 */
@Data
@ApiModel("码表")
public class GaSacwMb implements Serializable {

    private static final long serialVersionUID = -88403534680730172L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("父级id")
    private String parentId;

    @ApiModelProperty("父级名称")
    private String parentName;

    @ApiModelProperty("码类id")
    private String typeId;

    @ApiModelProperty("码类名称")
    private String typeName;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

}
