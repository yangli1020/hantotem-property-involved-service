package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 用户状态 VO
 * @since 2021/4/2 17:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "UserStateVO", description = "用户状态 VO")
public class UserStateVO implements Serializable {
    @ApiModelProperty(value = "用户 id", required = true, example = "12341234234")
    @NotNull
    private Long id;

    @ApiModelProperty(value = "用户当前状态 0:启用、1:禁用", required = true, example = "1")
    @NotNull
    private Integer state;
}
