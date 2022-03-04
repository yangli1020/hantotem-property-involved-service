package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author geekerstar
 * @date 2021/3/30 14:01
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "StockInOutViewVO", description = "物品出入库情况概览")
public class StockInOutViewVO {

    @ApiModelProperty("序号")
    private Integer xh;

    @ApiModelProperty("出入库时间")
    private String crksj;

    @ApiModelProperty("送取人所属单位代码")
    private String sqrssdwdm;

    @ApiModelProperty("送取人所属单位")
    private String sqrssdw;

    @ApiModelProperty("入库数量")
    private Integer rksl;

    @ApiModelProperty("入库数量")
    private Integer cksl;
}
