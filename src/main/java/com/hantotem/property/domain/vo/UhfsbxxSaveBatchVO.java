package com.hantotem.property.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description UHF 设备信息批量添加 VO
 * @since 2021/4/16 10:11
 */
@Data
@ApiModel(value = "UhfsbxxSaveBatchVO",description = "UHF 设备信息批量添加 VO")
public class UhfsbxxSaveBatchVO {
    @ApiModelProperty("id, 自动生成")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "设备 ip 地址",required = true)
    @NotBlank
    private String uhfip;

    @ApiModelProperty("设备天线数量")
    private Integer txsl;

    @ApiModelProperty(value = "所属单位代码",required = true)
    @NotBlank
    private String ssdwdm;

    @ApiModelProperty(value = "所属单位名称",required = true)
    @NotBlank
    private String ssdwmc;

    @ApiModelProperty("设备所在房间")
    private String room;

    @ApiModelProperty(value = "状态（0:正常 | 1:非正常）",required = true)
    private Integer state;
}
