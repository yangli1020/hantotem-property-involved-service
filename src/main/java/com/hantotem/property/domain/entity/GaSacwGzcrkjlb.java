package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *     柜子物品出入库记录表
 * </p>
 * @author Luosheng
 * @since 2021/6/3 11:24
 * @version 1.0.0
 */
@Data
@Api("柜子物品出入库记录表")
public class GaSacwGzcrkjlb implements Serializable {

    private static final long serialVersionUID = -44964824716082151L;

    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("送取人民警编号")
    private String sqrmjbh;

    @ApiModelProperty("送取人")
    private String sqr;

    @ApiModelProperty("送取人所属单位代码")
    private String sqrssdwdm;

    @ApiModelProperty("送取人所属单位")
    private String sqrssdw;

    @ApiModelProperty("物品唯一uuid")
    private String wpbh;

    @ApiModelProperty("物品rfid")
    private String wprfid;

    @ApiModelProperty("存放区域代码")
    private String cfqydm;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("操作编号")
    private String czbh;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("操作开始时间(前端必传)")
    private LocalDateTime czkssj;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @ApiModelProperty("物品状态小类代码(1.入库/2.出库/3.盘库)")
    private String wpczztdm;

    @ApiModelProperty("物品状态(1.入库/2.出库/3.盘库)")
    private String wpczzt;

    @ApiModelProperty("接收单位代码")
    private String jsdwdm;

    @ApiModelProperty("接收单位")
    private String jsdw;

    @ApiModelProperty("锁号")
    private Integer lockNum;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建人编号")
    private String createdCode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("更新人")
    private String updatedBy;

    @ApiModelProperty("更新人编号")
    private String updatedCode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;
}
