package com.hantotem.property.constant;

/**
 * 涉案财务调用接口常用地址
 */
public class AndroidAppConstant {

    /**
     * 涉案财务Android开柜程序地址
     */
    public static final String SACW_ANDROID_SYSTEM = "http://86.113.130.196:19804/involvedAndroid";

    /**
     * 开启串口接口地址 参数：SerialPortDTO
     */
    public static final String OPEN_SERIAL_PORT = "/openSerialPort";
    /**
     * 关闭串口接口地址 无参
     */
    public static final String CLOSE_SERIAL_PORT = "/closeSerialPort";
    /**
     * 批量开锁接口地址 参数：InvolvedLockOpenDTO
     */
    public static final String OPEN_LOCK_LIST = "/lockOpen";
    /**
     * 注册人脸识别图片接口
     */
    public static final String REGISTER_FACE_IMAGE_PORT = "/involvedAndroid/registeredFaceImage";
    /**
     * 查询指定锁状态接口地址 参数：InvolvedLockStateDTO
     */
    public static final String QUERY_LOCK_STATE = "/lockState";
    /**
     * 查询所有锁状态接口地址 参数：InvolvedLockStateAllDTO
     */
    public static final String QUERY_LOCK_STATE_LIST = "/lockStateAll";
    /**
     * 修改等待时间接口地址  参数：Integer lockWaitTime   开锁等待时间 ms
     *                        Integer stateWaitTime   查锁状态等待时间 ms
     */
    public static final String EXCHANGE_WAIT_TIME = "/changeWaitTime";

    public static final String VALIDATE_URL = "192.168.1.98";
    /**
     * app注册端口
     */
    public static final Integer VALIDATE_PORT = 9005;

    /**
     * 本地案管App开发程序地址
     */
    public static final String LOCAL_TEST_IPADDRESS= "http://192.168.1.86:19804/involvedAndroid";

    /**
     * 物品入库操作状态代码和说明
     */
    public static final String WPCZZTDM_IN = "1";
    public static final String WPCZZTDM_IN_MC = "入库";
    /**
     * 物品出库操作状态代码和说明
     */
    public static final String WPCZZTDM_OUT = "2";
    public static final String WPCZZTDM_OUT_MC = "出库";

    /**
     * 物品盘库操作状态代码和说明
     */
    public static final String WPCZZTDM_PANKU = "3";
    public static final String WPCZZTDM_PANKU_MC = "盘库";



}
