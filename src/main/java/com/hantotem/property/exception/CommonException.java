package com.hantotem.property.exception;

/**
 * @author geekerstar
 * @date 2020/4/15 11:25
 * @description 错误码约定:错误码为字符串类型，共5位，分成两个部分：错误产生来源+四位数字编号。错误产生来源分为A/B/C，A表示错误来源于用户，比如参数错误，用户安装版本过低，用户支付超时等问题；B表示错误来源于当前系统，往往是业务逻辑出错，或程序健壮性差等问题；C表示错误来源于第三方服务，比如CDN服务出错，消息投递超时等问题；四位数字编号从0001到9999，大类之间的步长间距预留100
 */
public class CommonException {

    /**
     * ************************************** 用户异常 **************************************
     */
    public static final BusinessException ERROR_REQUEST = new BusinessException("A0001", "无效的请求");
    public static final BusinessException PARAM_ERROR = new BusinessException("A0005", "请求参数有误");
    public static final BusinessException SIGN_TYPE_ERROR = new BusinessException("A0010", "出入库签字操作类型参数错误");
    public static final BusinessException PDA_SCAN_RFID_NULL = new BusinessException("A0015", "PDA扫描的RFID为空，请重新扫描");
    public static final BusinessException IN_OUT_STOCK_CAN_NOT_BATCH = new BusinessException("A0020", "盘库每次只允许单个物品登记出入库");

    /**
     * ************************************** 系统异常 **************************************
     */
    public static final BusinessException SYS_ERROR = new BusinessException("B0001", "系统内部异常,请查看异常日志");
    public static final BusinessException ADDRESS_ALREADY_IN_USE = new BusinessException("B0020", "端口被占用");

    /**
     * ************************************** 三方异常 **************************************
     */
    public static final BusinessException THREE_PART_DEMO = new BusinessException("C0001", "三方异常示例");

}
