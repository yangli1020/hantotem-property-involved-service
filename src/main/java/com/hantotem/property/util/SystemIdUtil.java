package com.hantotem.property.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author geekerstar
 * @date 2021/3/23 09:54
 * @description
 */
public class  SystemIdUtil {

    private SystemIdUtil() {
    }

    /**
     * 获取物品编号
     *
     * @return
     */
    public static String getWpbh() {
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        return "W" + snowflake.nextIdStr();
    }

    /**
     * 获取案件编号
     *
     * @return 案件编号
     */
    public static String getAjbh() {
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        return "A" + snowflake.nextIdStr();
    }

    /**
     * 获取操作编号
     *
     * @return
     */
    public static String getCzbh() {
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        return "C" + snowflake.nextIdStr();
    }

    /**
     * 获取ID
     *
     * @return
     */
    public static String getId() {
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        return snowflake.nextIdStr();
    }
}
