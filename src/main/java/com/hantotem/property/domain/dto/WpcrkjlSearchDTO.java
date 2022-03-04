package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 物品出入库记录 DTO
 * @since 2021/3/25 11:48
 */
@Data
@ApiModel(value = "WpcrkjlSearchDTO", description = "物品出入库记录 DTO")
public class WpcrkjlSearchDTO implements Serializable {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("物品编号")
    private String wpbh;

    @ApiModelProperty("送取人所属单位")
    private String sqrssdw;

    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("送取人")
    private String sqr;
    
    @ApiModelProperty("送取人民警编号")
    private String sqrmjbh;

    @ApiModelProperty("送取人签字")
    private String sqrqz;

    @ApiModelProperty("送取人联系方式")
    private String sqrlxfs;

    @ApiModelProperty("视频地址")
    private String spdz;

    @ApiModelProperty("文书地址")
    private String wsdz;

    @ApiModelProperty("物品状态大类代码(1.在库/2.出库)")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类(1.在库/2.出库)")
    private String wpztdl;

    @ApiModelProperty("物品状态小类代码(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxldm;

    @ApiModelProperty("物品状态小类(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxl;

    @ApiModelProperty("柜端状态代码(1.待入库/2.已入库库/3.待出库/4.已出库)")
    private String gdztdm;

    @ApiModelProperty("柜端状态名称(1.待入库/2.已入库库/3.待出库/4.已出库)")
    private String gdztmc;

    @ApiModelProperty("序号")
    private Integer index;
}
