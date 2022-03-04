package com.hantotem.property.enums;

import lombok.Getter;

/**
 * 警综微服务平台参数
 *
 * @author 肖云标
 * @since 2021/4/16
 */
@Getter
public enum JzArgumentEnum {
    KM("530100000000", "云南省昆明市公安局", "YkeICbx146YsKVnO", "b49e17fd08c64186b6c42747cf7677e2", "530100")
    ,BS("530500000000", "云南省保山市公安局", "C2v6OJjHx87CgBHc", "e106d5a42b924389b00d8f89451f5b4e", "530500")
    ,PE("530800000000", "云南省普洱市公安局", "v7wDRF1aPfDnlHH6", "9def69e0e05e43ca960f575668711ea0", "530800")
    ,ML("530304000000", "云南省曲靖市马龙分局", "fKa55H0rqJnolQ8X", "f8894a7e9cd0410fad61f86c314f3841", "530300")
    ,NJ("533300000000", "怒江傈僳族自治州公安局", "SGMjl70Drox8B1kX", "586426dfd40040f980bdf303ac0c6e76", "533300")
    ;

    /**
     * 单位代码
     */
    private final String unitId;

    /**
     * 单位名称
     */
    private final String unitName;

    /**
     * 应用编码
     */
    private final String appCode;

    /**
     * 应用秘钥
     */
    private final String secretKey;

    /**
     * 行政区划
     */
    private final String district;

    JzArgumentEnum(String unitId, String unitName, String appCode, String secretKey, String district) {
        this.unitId = unitId;
        this.unitName = unitName;
        this.appCode = appCode;
        this.secretKey = secretKey;
        this.district = district;
    }
}
