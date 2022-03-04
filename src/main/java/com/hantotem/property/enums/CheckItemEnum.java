package com.hantotem.property.enums;

import lombok.Getter;

/**
 * @author geekerstar
 * @date 2021/3/25 10:53
 * @description
 */
@Getter
public enum CheckItemEnum {

    // 盘库物品状态
    NORMAL(1, "正常", "系统记录与库内数量一致"),
    CHECK_NORMAL(2, "校验正常", "经核实，该物品存放状态正常"),
    ABNORMAL_LESS(3, "异常-少件", "该物品未在库内"),
    ABNORMAL_MANY(4, "异常-多件", "该物品未在系统内录入"),
    CHECK_IN(5, "盘点登记入库", "经核实，将该物品标记为入库"),
    CHECK_OUT(6, "盘点登记出库", "经核实，将该物品标记为出库");

    private final Integer code;
    private final String value;
    private final String desc;

    CheckItemEnum(Integer code, String value, String desc) {
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

}
