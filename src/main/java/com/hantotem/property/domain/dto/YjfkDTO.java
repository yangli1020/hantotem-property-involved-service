package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 意见反馈 DTO
 * @since 2021/3/26 11:18
 */
@ApiModel(value = "YjfkDTO", description = "意见反馈 DTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YjfkDTO implements Serializable {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("问题描述")
    private String wtms;

    @ApiModelProperty("问题截图")
    private String wtjt;

    @ApiModelProperty("序号")
    private String index;

}
