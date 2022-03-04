package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "数据汇聚数据传输视频信息")
public class SjhjspxxVO implements Serializable {
    private static final long serialVersionUID = -6743673499208632045L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("视频编号")
    private String spbh;
    @ApiModelProperty("物品编号")
    private String wpbh;
    @ApiModelProperty("出入库记录编号")
    private String crkjlbh;
    @ApiModelProperty("视频开始时间")
    private Date spkssj;
    @ApiModelProperty("视频结束时间")
    private Date spjssj;
    @ApiModelProperty("视频文件地址")
    private String spwjdz;
    @ApiModelProperty("视频文件大小(M)")
    private Integer spwjdx;
    @ApiModelProperty("文件时长(s)")
    private Integer wjsc;
    @ApiModelProperty("图片文件地址")
    private String tpwjdz;
    @ApiModelProperty("摄像头设备编码")
    private String ipcsbbm;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;
}
