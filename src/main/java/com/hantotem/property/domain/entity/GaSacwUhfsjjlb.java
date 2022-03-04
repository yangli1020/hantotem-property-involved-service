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
@ApiModel("UHF 数据记录表")
public class GaSacwUhfsjjlb implements Serializable {
    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("采集器 ip")
    private String uhfip;

    @ApiModelProperty("标签 frid")
    private String wprfid;

    @ApiModelProperty("天线编号")
    private Integer txbh;

    @ApiModelProperty("RSSI1 强度")
    private Integer rssi1;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

}
