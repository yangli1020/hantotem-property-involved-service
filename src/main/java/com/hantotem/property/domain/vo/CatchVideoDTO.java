package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author geekerstar
 * @date 2020/7/27 13:41
 * @description
 */
@Data
@ApiModel(value = "CatchVideoDTO", description = "视频下载传参实体")
public class CatchVideoDTO {

    @ApiModelProperty("设备品牌名称(海康HK,大华DH)")
    private String brandName;

    @ApiModelProperty("摄像头编码(H264,H265)")
    private String cameraCode;

    @ApiModelProperty("NVR ip地址")
    private String ip;

    @ApiModelProperty("端口")
    private Integer port;

    @ApiModelProperty("设备用户名")
    private String account;

    @ApiModelProperty("设备密码")
    private String password;

    @ApiModelProperty("摄像枪NVR通道号")
    private Integer channel;

    @ApiModelProperty("事件流水号")
    private String eventNo;

    @ApiModelProperty("记录标识")
    private String recordNo;

    @ApiModelProperty("入所时间(2020_07_27)")
    private String enteringTime;

    @ApiModelProperty("嫌疑人编号")
    private String suspectNo;

    @ApiModelProperty("视频截取开始时间")
    private Date clipStartTime;

    @ApiModelProperty("视频截取结束时间")
    private Date clipEndTime;

    @ApiModelProperty("处理类型")
    private String processType;

    @ApiModelProperty("摄像头ip地址")
    private String cameraIp;
    
    @ApiModelProperty("是否回调")
    private String sfhd;

    @ApiModelProperty(value = "摄像头型号", example = "摄像头型号")
    private String cameraType;

}
