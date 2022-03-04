package com.hantotem.property.enums;

import lombok.Getter;

/**
 * @author geekerstar
 * @date 2021/3/26 09:31
 * @description
 */
@Getter
public enum ConfirmEnum {

    // 核对状态(1.标记正常/2.登记入库/3.登记出库)
    NORMAL(1, "标记正常"),
    REGISTER_IN(2, "登记入库"),
    REGISTER_OUT(3, "登记出库");

    private final Integer code;
    private final String value;

    ConfirmEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
