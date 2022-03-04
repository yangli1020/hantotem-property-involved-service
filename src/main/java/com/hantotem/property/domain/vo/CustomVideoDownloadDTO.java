package com.hantotem.property.domain.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;


@ApiModel(value = "CustomVideoDownloadDTO", description = "自定义视频下载参数实体")
public class CustomVideoDownloadDTO {

    @ApiModelProperty("事件流水号")
    private String eventNo;

    @ApiModelProperty("记录标识")
    private String recordNo;

    @ApiModelProperty("入所时间(2020_07_27)")
    private String enteringTime;

    @ApiModelProperty("嫌疑人身份证号码")
    private String suspectNo;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("视频截取开始时间")
    private Date clipStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("视频截取结束时间")
    private Date clipEndTime;

    @ApiModelProperty("处理类型")
    private String processType;

    @ApiModelProperty("摄像头参数列表")
    List<CameraParamDTO> cameraParamList;
    
    @ApiModelProperty("是否回调")
    private String sfhd;

    @ApiModelProperty("是否最后一次")
    private Integer isLast=0;

    @ApiModelProperty("下载段数")
    private Integer downNumber;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("视频开始时间 - 审讯开始时间")
    private Date startTime;

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public String getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(String enteringTime) {
        this.enteringTime = enteringTime;
    }

    public String getSuspectNo() {
        return suspectNo;
    }

    public void setSuspectNo(String suspectNo) {
        this.suspectNo = suspectNo;
    }

    public Date getClipStartTime() {
        return clipStartTime;
    }

    public void setClipStartTime(Date clipStartTime) {
        this.clipStartTime = clipStartTime;
    }

    public Date getClipEndTime() {
        return clipEndTime;
    }

    public void setClipEndTime(Date clipEndTime) {
        this.clipEndTime = clipEndTime;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public List<CameraParamDTO> getCameraParamList() {
        return cameraParamList;
    }

    public void setCameraParamList(List<CameraParamDTO> cameraParamList) {
        this.cameraParamList = cameraParamList;
    }

    public String getSfhd() {
        return sfhd;
    }

    public void setSfhd(String sfhd) {
        this.sfhd = sfhd;
    }

    public Integer getIsLast() {
        return isLast;
    }

    public void setIsLast(Integer isLast) {
        this.isLast = isLast;
    }

    public Integer getDownNumber() {
        return downNumber;
    }

    public void setDownNumber(Integer downNumber) {
        this.downNumber = downNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}


