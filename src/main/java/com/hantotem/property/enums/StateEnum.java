package com.hantotem.property.enums;

import lombok.Getter;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 各种状态相关 枚举
 * @since 2021/3/25 10:33
 */
@Getter
public enum StateEnum {
    /**
     * 用户启用状态
     */
    STATE_USER_ENABLED(0, "启用"),
    /**
     * 用户禁用状态
     */
    STATE_USER_BANNED(1, "禁用"),
    /**
     * 全局状态为 不正常
     */
    STATE_ABNORMAL(1, "全局状态为 不正常，或者是被逻辑删除的"),
    /**
     * 全局状态为 正常
     */
    STATE_NORMAL(0, "全局状态为 正常");
    private final Integer code;
    private final String value;

    StateEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }
}
