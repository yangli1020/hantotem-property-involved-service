package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiuXiangMin
 * @ClassName DepartmentStatisticVO
 * @description TODO
 * @Date 2021/3/24 15:00
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentStatisticVO {

    @ApiModelProperty("code")
    private Integer xh;

    @ApiModelProperty("名称")
    private String dwmc;

    @ApiModelProperty("单位代码")
    private String dwdm;

    @ApiModelProperty("数量")
    private Integer number;
}
