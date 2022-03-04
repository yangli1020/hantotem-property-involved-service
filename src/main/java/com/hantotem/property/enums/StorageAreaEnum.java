package com.hantotem.property.enums;

import lombok.Data;

/**
 * @author LiuXiangMin
 * @ClassName StorageAreaEnum
 * @description TODO
 * @Date 2021/3/24 11:26
 * @Version 1.0
 */
public enum StorageAreaEnum {

    STORAGEAREA_SHELF_CARGO("1","货架"),
    STORAGEAREA_SHELF_GOODS("2","物管柜"),
    STORAGEAREA_SHELF_UNMAGNENT("3","防磁柜"),
    STORAGEAREA_SHELF_UNCORRODE("4","防腐柜"),
    STORAGEAREA_SHELF_PASSWORD("5","密码柜");

    private final String code;
    private final String value;

    StorageAreaEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
