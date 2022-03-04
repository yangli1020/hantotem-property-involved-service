package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 出入库记录表(GaSacwCrkjlb)实体类
 *
 * @author geekerstar
 * @since 2021-03-22 16:45:53
 */
@Data
@ApiModel("出入库记录表")
public class GaSacwCrkjlb implements Serializable {

    private static final long serialVersionUID = -44964824716082151L;

    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("案件主办单位")
    private String ajzbdw;

    @ApiModelProperty("送取人民警编号")
    private String sqrmjbh;

    @ApiModelProperty("送取人")
    private String sqr;

    @ApiModelProperty("送取人所属单位代码")
    private String sqrssdwdm;

    @ApiModelProperty("送取人所属单位")
    private String sqrssdw;

    @ApiModelProperty("送取人签字")
    private String sqrqz;

    @ApiModelProperty("送取人联系方式")
    private String sqrlxfs;

    @ApiModelProperty("物品唯一uuid")
    private String wpbh;

    @ApiModelProperty("物品rfid")
    private String wprfid;

    @ApiModelProperty("物品名称")
    private String wpmc;

    @ApiModelProperty("存放区域代码")
    private String cfqydm;

    @ApiModelProperty("存放区域")
    private String cfqy;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("操作编号")
    private String czbh;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("签字时间")
    private LocalDateTime qzsj;

    @ApiModelProperty("物品状态大类代码(1.在库/2.出库)")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类(1.在库/2.出库)")
    private String wpztdl;

    @ApiModelProperty("物品状态小类代码(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxldm;

    @ApiModelProperty("物品状态小类(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxl;

    @ApiModelProperty("柜端状态代码(1.待入库/2.已入库/3.待出库/4.已出库)")
    private String gdztdm;

    @ApiModelProperty("柜端状态代码(1.待入库/2.已入库/3.待出库/4.已出库)")
    private String gdztmc;

    @ApiModelProperty("接收单位代码")
    private String jsdwdm;

    @ApiModelProperty("接收单位")
    private String jsdw;

    @ApiModelProperty("文书地址")
    private String wsdz;

    @ApiModelProperty("视频地址")
    private String spdz;

    @ApiModelProperty("0正常出入库，1盘库")
    private Integer sjly;

    @ApiModelProperty("状态")
    private Integer state;

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
