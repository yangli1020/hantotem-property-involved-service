package com.hantotem.property.enums;

import lombok.Getter;
/**
 * <p>
 *     角色值类型枚举
 * </p>
 * @author Luosheng
 * @since 2021/7/13 10:57
 * @version 1.0.0
 */
@Getter
public enum RoleEnum {

    FORBIDDEN("0","无权限人员"),
    ADMIN("1","超级管理员"),  //亦称物管员
    VISITOR("2","游客"),
    SIGHTSEER("3","访客");



    private final String code;
    private final String value;

    RoleEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
