package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChestLockStateVo {

    @ApiModelProperty("柜子ip")
    private String cabinetIp;

    @ApiModelProperty("锁控版号")
    private Integer boardNo;
}
