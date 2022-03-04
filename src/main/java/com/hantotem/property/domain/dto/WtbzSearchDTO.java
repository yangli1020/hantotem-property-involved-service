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
 * @description 问题查询 DTO
 * @since 2021/3/26 10:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "WtbzSearchDTO", description = "问题查询 DTO")
public class WtbzSearchDTO implements Serializable {
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

    @ApiModelProperty("序号")
    private Integer index;

}
