package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author geekerstar
 * @date 2021/3/25 16:25
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CheckProcessSubDTO", description = "盘库物品列表入参")
public class CheckProcessSubDTO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("物品编号")
    private String wpbh;
}
