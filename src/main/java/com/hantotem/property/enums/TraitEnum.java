package com.hantotem.property.enums;

/**
 * @author LiuXiangMin
 * @ClassName TraitEnum
 * @description TODO
 * @Date 2021/3/24 11:41
 * @Version 1.0
 */
public enum TraitEnum {

    TRAIT_GENERAL("1","一般物品"),
    TRAIT_ENVALUABLE("2","贵重物品"),
    TRAIT_SPECIFIC("3","特殊物品"),
    TRAIT_ANOTHER("4","其它物品");

    private final String code;
    private final String value;

    TraitEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
