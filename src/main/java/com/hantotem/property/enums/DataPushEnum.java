package com.hantotem.property.enums;

/**
 * @author quwuqing
 * @version 1.0
 * @className DataPushEnum
 * @description TODO
 * @since 2021/9/29 16:21
 */
public enum DataPushEnum {

    // 推送数据url
    ml("qwe", "3", "http://86.113.130.196:10011/glzx-converge/data/converge/common","5303210000003"),
    zy("qwe", "1", "http://86.190.22.243:10011/glzx-converge/data/converge/common","5308250000003"),
    mh("qwe", "1", "http://86.251.29.127:10011/glzx-converge/data/converge/common","5328220000003"),
    lm("qwe", "1", "http://86.250.55.2:10011/glzx-converge/data/converge/common","5328230000003");

    private final String salt;
    private final String key;
    private final String url;
    private final String xtbm;

    DataPushEnum(String salt, String key, String url, String xtbm) {
        this.salt = salt;
        this.key = key;
        this.url = url;
        this.xtbm = xtbm;
    }

    public String getSalt() {
        return salt;
    }

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }

    public String getXtbm() {
        return xtbm;
    }
}
