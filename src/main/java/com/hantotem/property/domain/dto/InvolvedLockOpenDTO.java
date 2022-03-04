package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>
 *     开锁参数实体
 * </p>
 * @author Luosheng
 * @since 2021/6/4 10:14
 * @version 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "InvolvedLockOpenDTO", description = "开启指定锁入参")
public class InvolvedLockOpenDTO {

    @ApiModelProperty(value = "柜子IP", example = "192.168.1.98")
    private String cabinetIp;

    @ApiModelProperty(value = "锁控板编号", example = "1")
    private Integer boardNo;

    @ApiModelProperty(value = "锁编号(支持多个)", example = "1")
    private List<Integer> lockNoList;
}
