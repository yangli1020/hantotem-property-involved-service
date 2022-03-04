package com.hantotem.property.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author geekerstar
 * @date 2020/7/28 14:22
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "MessageCallbackDTO", description = "视频处理消息回调参数")
public class MessageCallbackDTO {

    @ApiModelProperty("记录标识")
    private String jlbs;

    @ApiModelProperty("处理类型")
    private String cllx;

    @ApiModelProperty("视频存储位置")
    private String spccwz;

    @ApiModelProperty("图片存储位置")
    private String tpccwz;

    @ApiModelProperty("文件时长")
    private String wjsc;

    @ApiModelProperty("文件大小")
    private String wjdx;

    @ApiModelProperty("视频开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date spkssj;

    @ApiModelProperty("视频结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date spjssj;

    @ApiModelProperty("摄像头ip地址")
    private String ipaddress;

    @ApiModelProperty("服务端口")
    private String serverport;

    @ApiModelProperty("中控设备标识")
    private String zksbbs;

}
