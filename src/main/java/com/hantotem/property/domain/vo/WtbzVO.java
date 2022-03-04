package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 问题帮助 VO
 * @since 2021/3/26 11:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "WtbzVO", description = "问题帮助 VO")
public class WtbzVO implements Serializable {
    
    @ApiModelProperty("问题描述")
    private String wtms;

    @ApiModelProperty("解答文本描述")
    private String jdms;

    @ApiModelProperty("操作手册视频url")
    private String czsc;

}
