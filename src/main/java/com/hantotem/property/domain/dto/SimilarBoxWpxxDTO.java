package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * <p>
 *     绑定案件的待入库物品
 * </p>
 * @author Luosheng
 * @since 2021/6/8 17:17
 * @version 1.0.0
 */
@Data
@Builder
public class SimilarBoxWpxxDTO {
    @ApiModelProperty(name = "ajbh",value = "案件编号",example = "A5301117000002019090234")
    private String ajbh;

    @ApiModelProperty(name = "jsdwdm",value = "接收单位代码",example = "530100000000")
    private String jsdwdm;

    @ApiModelProperty(name = "sPage",value = "页数，不分页传1" ,example = "1")
    private Integer sPage;

    @ApiModelProperty(name = "sSize",value = "每页大小，不分页传10",example = "10")
    private Integer sSize;
}
