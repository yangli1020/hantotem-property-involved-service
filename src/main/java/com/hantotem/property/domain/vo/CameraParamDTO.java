package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(value = "CustomVideoDownloadParamDTO", description = "自定义视频下载参数实体")
public class CameraParamDTO {

    @ApiModelProperty("设备品牌名称(海康HK,大华DH)")
    private String brandName;

    @ApiModelProperty("摄像头编码(H264,H265)")
    private String cameraCode;

    @ApiModelProperty("ip地址 nvr的ip")
    private String ip;

    @ApiModelProperty("端口")
    private Integer port;

    @ApiModelProperty("设备用户名")
    private String account;

    @ApiModelProperty("设备密码")
    private String password;

    @ApiModelProperty("摄像枪NVR通道号")
    private Integer channel;

    @ApiModelProperty("合成序号")
    private Integer no;

    @ApiModelProperty(value = "摄像头型号", example = "摄像头型号")
    private String cameraType;

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCameraCode() {
        return cameraCode;
    }

    public void setCameraCode(String cameraCode) {
        this.cameraCode = cameraCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
}