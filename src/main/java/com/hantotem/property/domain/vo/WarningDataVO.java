package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author LiuXiangMin
 * @ClassName WarningDataVO
 * @description TODO
 * @Date 2021/3/30 17:33
 * @Version 1.0
 */
@Data
public class WarningDataVO {

    @ApiModelProperty("czbh")
    private String czbh;

    @ApiModelProperty("次数")
    private Integer yjcs;
}
