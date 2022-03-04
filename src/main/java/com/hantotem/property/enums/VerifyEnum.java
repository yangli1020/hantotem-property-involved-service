package com.hantotem.property.enums;

import lombok.Getter;

/**
 * @author geekerstar
 * @date 2021/3/26 09:25
 * @description
 */
@Getter
public enum VerifyEnum {

    // 核实状态(1.无需核实/2.已核实/3.未核实)
    NOT_REQUIRED(1, "无需核实"),
    VERIFIED(2, "已核实"),
    UN_VERIFIED(3, "未核实");

    private final Integer code;
    private final String value;

    VerifyEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

}
