package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description
 * @since 2021/4/15 17:02
 */
@Data
@ApiModel("UHF 设备信息表")
public class GaSacwUhfsbxxb implements Serializable {
    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("设备 ip 地址")
    private String uhfip;

    @ApiModelProperty("设备天线数量")
    private Integer txsl;

    @ApiModelProperty("设备所在房间")
    private String room;

    @ApiModelProperty("所属单位代码")
    private String ssdwdm;

    @ApiModelProperty("所属单位名称")
    private String ssdwmc;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;
}
