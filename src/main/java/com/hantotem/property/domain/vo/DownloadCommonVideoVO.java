package com.hantotem.property.domain.vo;

import lombok.Data;

import java.util.Date;

@Data
public class DownloadCommonVideoVO {

    //视频下载程序ip地址
    private String ip;

    //摄像头ip地址(单视频下载时需要使用)
    private String sxtIpaddress;

    //所属单位代码
    private String ssdwdm;

    //房间类型(用于指定下载房间)
    private String roomType;

    //视频开始时间
    private Date startTime;

    //视频结束时间
    private Date endTime;

    //视频类型 具体看DownloadVideoEnum枚举类
    private Integer splxdm;

    //视频类型名称
    private String splxmc;

    //入库时间(卷宗信息表)
    private Date rksj;

    //卷宗编号
    private String jzbh;

    //出库库记录编号
    private String jlbh;

    //标签id
    private String bqid;

    //操作编号
    private String czbh;
}
