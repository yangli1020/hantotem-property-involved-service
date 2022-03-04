package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author LiuXiangMin
 * @ClassName StorageTimeLagVO
 * @description TODO
 * @Date 2021/3/24 15:41
 * @Version 1.0
 */
@Data
public class StorageTimeLagVO {

    @ApiModelProperty("时间段1 0-15")
    private String sjd1;

    @ApiModelProperty("时间段2 15-30")
    private String sjd2;

    @ApiModelProperty("时间段3 30-90")
    private String sjd3;

    @ApiModelProperty("时间段4 90-180")
    private String sjd4;

    @ApiModelProperty("时间段5 180-365")
    private String sjd5;

    @ApiModelProperty("时间段6 365以上")
    private String sjd6;


}
