package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @since 2021/4/15 17:02
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("UHF 异常记录表")
public class GaSacwUhfycjlb{
    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("采集器 ip")
    private String uhfip;

    @ApiModelProperty("标签 frid")
    private String wprfid;

    @ApiModelProperty("物品编号")
    private String wpbh;

    @ApiModelProperty("视频地址")
    private String spdz;

    @ApiModelProperty("异常开始时间")
    private LocalDateTime yckssj;

    @ApiModelProperty("异常截止时间")
    private LocalDateTime ycjzsj;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("处置状态(0.未处置,1.已处置)")
    private Integer czzt;

    @ApiModelProperty("图片地址")
    private String tpdz;

    @ApiModelProperty("文件时长")
    private Long wjsc;

    @ApiModelProperty("文件大小")
    private Long wjdx;

    @ApiModelProperty("视频开始时间")
    private LocalDateTime spkssj;

    @ApiModelProperty("视频结束时间")
    private LocalDateTime spjssj;

    @ApiModelProperty("文件名称")
    private String wjmc;
}
