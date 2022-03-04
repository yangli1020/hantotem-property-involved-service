package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author geekerstar
 * @date 2021/3/29 17:51
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "StatisticsPartitionVO", description = "物品统计概览")
public class StatisticsPartitionVO {

    @ApiModelProperty("分类ID")
    private String partId;

    @ApiModelProperty("分类名称")
    private String partName;

    @ApiModelProperty("分类数量")
    private String partNum;
}
