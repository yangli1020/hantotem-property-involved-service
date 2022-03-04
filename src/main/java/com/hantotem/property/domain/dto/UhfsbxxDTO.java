package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description Uhf DTO
 * @since 2021/4/22 16:46
 */
@Data
@ApiModel(value = "UhfsbxxDTO",description = "UHF 设备信息 DTO")
public class UhfsbxxDTO {
    @ApiModelProperty("id")
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

    @ApiModelProperty("序号")
    private Integer index;
}
