package com.hantotem.property.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class GaSacwSpxxCallbackVO {
    /**
     * 自编号
     */
    @ApiModelProperty(value="zbh自编号")
    private Integer zbh;

    /**
     * 记录标识
     */
    @ApiModelProperty(value="jlbs记录标识")
    private String jlbs;

    /**
     * 处理类型
     */
    @ApiModelProperty(value="cllx处理类型")
    private String cllx;

    /**
     * 视频存储位置
     */
    @ApiModelProperty(value="spccwz视频存储位置")
    private String spccwz;

    /**
     * 图片存储位置
     */
    @ApiModelProperty(value="tpccwz图片存储位置")
    private String tpccwz;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value="cjsj创建时间")
    private Date cjsj;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value="gxsj更新时间")
    private Date gxsj;

    /**
     * 启用状态
     */
    @ApiModelProperty(value="qyzt启用状态")
    private Integer qyzt;

    /**
     * 所属单位代码
     */
    @ApiModelProperty(value="ssdwdm所属单位代码")
    private String ssdwdm;

    /**
     * 所属单位名称
     */
    @ApiModelProperty(value="ssdwmc所属单位名称")
    private String ssdwmc;

    /**
     * 文件时长
     */
    @ApiModelProperty(value="wjsc文件时长")
    private String wjsc;

    /**
     * 文件大小
     */
    @ApiModelProperty(value="wjdx文件大小")
    private String wjdx;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value="视频开始时间")
    private Date spkssj;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value="视频结束时间")
    private Date spjssj;

    @ApiModelProperty(value="摄像头ip地址")
    private String ipaddress;

}