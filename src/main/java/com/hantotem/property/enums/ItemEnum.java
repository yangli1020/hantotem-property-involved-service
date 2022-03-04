package com.hantotem.property.enums;

import lombok.Getter;

/**
 * @author geekerstar
 * @date 2021/3/23 20:17
 * @description
 */
@Getter
public enum ItemEnum {

    // 物品状态大类(1.在库/2.出库)
    ITEM_IN("1", "在库"),
    ITEM_OUT("2", "出库"),
    // 物品状态小类(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)
    ITEM_SUB_IN_NOT_SIGN("1", "登记入库未签字"),
    ITEM_SUB_IN_SIGN("2", "登记入库"),
    ITEM_SUB_OUT_NOT_SIGN("3", "登记出库未签字"),
    ITEM_SUB_OUT_SIGN("4", "登记出库"),
    ITEM_SUB_OUT_ABNORMAL("5", "异常出库"),
    //物品柜端状态(1.待入库/2.已入库/3.待出库/4.已出库)
    ITEM_GZ_NOT_INTO("1","待入库"),
    ITEM_GZ_INTO("2","已入库"),
    ITEM_GZ_NOT_OUT("3","待出库"),
    ITEM_GZ_OUT("4","已出库"),
    //物品入柜操作状态
    ITEM_IN_CABINET("1","入库"),
    ITEM_OUT_CABINET("2","出库");


    private final String code;
    private final String value;

    ItemEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }


}
