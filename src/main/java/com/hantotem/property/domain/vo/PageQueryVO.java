package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 分页查询 VO
 * @since 2021/3/26 10:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "PageQueryVO", description = "分页查询 VO")
public class PageQueryVO implements Serializable {
    @ApiModelProperty("当前页数【默认为 1】")
    @Min(value = 1, message = "必须大于 0")
    private Integer current;

    @ApiModelProperty("每页条数【默认为 10】")
    @Min(value = 1, message = "必须大于 0")
    @Max(value = 200, message = "不得大于 200")
    private Integer size;

    @ApiModelProperty("查询条件")
    private String query;
}
