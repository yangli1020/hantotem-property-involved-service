package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 意见反馈 VO
 * @since 2021/3/26 11:18
 */
@ApiModel(value = "YjfkDTO", description = "意见反馈 VO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YjfkVO implements Serializable {
    @ApiModelProperty("问题描述")
    @NotBlank
    private String wtms;

    @ApiModelProperty("问题截图")
    private String wtjt;

    @ApiModelProperty("登录人警号")
    @NotBlank
    private String dlrjh;
}
