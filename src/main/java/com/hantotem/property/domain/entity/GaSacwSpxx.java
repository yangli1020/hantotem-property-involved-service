package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value="GaSacwSpxx")
public class GaSacwSpxx {
    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value="zbh自编号")
    private Long zbh;

    @ApiModelProperty(value="cjsj创建时间")
    private Date cjsj;

    @ApiModelProperty(value="gxsj更新时间")
    private Date gxsj;

    @ApiModelProperty(value="sfsc是否删除")
    private Short sfsc;

    @ApiModelProperty(value="spbh视频编号。视频信息表主键")
    private String spbh;

    @ApiModelProperty(value="jlbh出入柜记录编号")
    private String jlbh;

    @ApiModelProperty(value="jzbh卷宗编号")
    private String jzbh;

    @ApiModelProperty(value="bqid标签id")
    private String bqid;

    @ApiModelProperty(value="spkssj视频开始时间")
    private Date spkssj;

    @ApiModelProperty(value="spjssj视频结束时间")
    private Date spjssj;

    @ApiModelProperty(value="wjdz文件地址")
    private String spwjdz;

    @ApiModelProperty(value="wjdx文件大小")
    private Long spwjdx;

    @ApiModelProperty(value="wjsc文件时长。单位s")
    private Long wjsc;

    @ApiModelProperty(value="图片文件地址")
    private String tpwjdz;

    @ApiModelProperty(value="sxtip摄像头ip")
    private String sxtip;

    @ApiModelProperty(value="sxtlx摄像头类型。1=登记区，2=案管柜")
    private Short sxtlx;

    @ApiModelProperty(value="sxtxh摄像头序号")
    private Integer sxtxh;

    @ApiModelProperty(value="splxdm视频类型 1=单正常视频 2=单预警视频 3=多合一正常视频 4=多合一预警视频")
    private Integer splxdm;

    @ApiModelProperty(value="splxmc视频类型 1=单正常视频 2=单预警视频 3=多合一正常视频 4=多合一预警视频")
    private String splxmc;

    @ApiModelProperty(value="操作编号")
    private String czbh;
}