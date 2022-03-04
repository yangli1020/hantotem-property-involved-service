package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiuXiangMin
 * @ClassName ShelfVO
 * @description TODO
 * @Date 2021/3/24 12:01
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShelfVO {

    @ApiModelProperty("code")
    private String code;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("数量")
    private Integer number;

}
