package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author geekerstar
 * @date 2021/3/23 10:51
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ItemRemoveDTO", description = "删除物品入参")
public class ItemRemoveDTO {

    @NotBlank(message = "物品编号不能为空")
    @ApiModelProperty(value = "物品唯一uuid", example = "W1374171238783651822")
    private String wpbh;

}
