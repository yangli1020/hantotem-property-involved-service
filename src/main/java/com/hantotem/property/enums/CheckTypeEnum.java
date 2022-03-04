package com.hantotem.property.enums;

import lombok.Getter;

/**
 * @author geekerstar
 * @date 2021/3/26 09:33
 * @description
 */
@Getter
public enum CheckTypeEnum {

    // 是否异常(0.正常/1.异常)
    NORMAL(0, "正常"),
    ABNORMAL(1, "异常"),
    // 是否完成(0.未完成/1.完成)
    NOT_FINISH(0, "未完成"),
    FINISH(1, "完成"),
    // 异常类型(1.少件/2.多件)
    LESS(1, "少件"),
    MORE(2, "多件");

    private final Integer code;
    private final String value;

    CheckTypeEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
