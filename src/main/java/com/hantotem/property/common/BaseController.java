package com.hantotem.property.common;

import cn.hutool.core.util.IdUtil;

/**
 * @author geekerstar
 * @date 2020/11/26 14:52
 * @description
 */
public class BaseController {

    public Long getId() {
        return IdUtil.getSnowflake(1, 1).nextId();
    }

    public String getIdStr() {
        return IdUtil.getSnowflake(1, 1).nextIdStr();
    }
}
