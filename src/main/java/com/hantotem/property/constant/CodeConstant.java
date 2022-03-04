package com.hantotem.property.constant;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 各种状态码常量
 * @since 2021/3/24 10:57
 */
public class CodeConstant {
    /**
     * token 失效，若前端收到此状态码，则需要用户重新登录
     */
    public static final String CODE_INVALID_TOKEN="413";
    /**
     * 401 unauthorized 状态
     */
    public static final String CODE_UNAUTHORIZED="401";
    /**
     * 403 forbidden 状态
     */
    public static final String CODE_FORBIDDEN="403";
    /**
     * 404 not found 状态
     */
    public static final String CODE_NOT_FOUND="404";
    /**
     * 200 ok 状态
     */
    public static final String CODE_OK="200";
    /**
     * 500 error 状态
     */
    public static final String CODE_ERROR="500";
}
