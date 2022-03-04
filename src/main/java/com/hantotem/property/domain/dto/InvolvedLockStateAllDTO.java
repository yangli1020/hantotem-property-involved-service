package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *     查询所有锁状态参数实体
 * </p>
 * @author Luosheng
 * @since 2021/6/4 10:16
 * @version 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "InvolvedLockStateAllDTO", description = "批量查询锁状态入参")
public class InvolvedLockStateAllDTO {

    @ApiModelProperty(value = "柜子IP", example = "192.168.1.98")
    private String cabinetIp;

    @ApiModelProperty(value = "锁控板编号", example = "1")
    private Integer boardNo;
}
