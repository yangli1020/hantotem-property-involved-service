package com.hantotem.property.constant;

import lombok.Builder;
import lombok.Data;
import org.apache.ibatis.annotations.ConstructorArgs;

/**
 * <p>
 *     自定义异常常量
 * </p>
 * @author Luosheng
 * @since 2021/6/7 15:56
 * @version 1.0.0
 */
@Data
@Builder
public class CustomConstant {
    private String code;

    private String msg;

    /**
     * 实体类为空
     */
    public static final CustomConstant ENTITY_NULL= new CustomConstant("201","传入的物品列表为空");

    /**
     * 单位下柜体为空
     */
    public static final CustomConstant CABINET_NULL=new CustomConstant("202","该单位下不存在指定柜子");
    /**
     * 操作成功
     */
    public static final CustomConstant DATA_SUCCESS=new CustomConstant("200","操作记录持久化成功");

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
