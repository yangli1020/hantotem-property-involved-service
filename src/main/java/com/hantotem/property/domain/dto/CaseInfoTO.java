package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 查询案件信息入参
 *
 * @author 肖云标
 * @since 2021/1/19
 */
@Data
public class CaseInfoTO {
    @ApiModelProperty(value = "单位编码，登陆人权限单位。", example = "530304000000")
    private String unitNo;

    @ApiModelProperty(value = "搜索条件", example = "诈骗案")
    private String search;

    @ApiModelProperty(value = "开始时间", example = "2021-01-01")
    private String startTime;

    @ApiModelProperty(value = "结束时间", example = "2021-07-01")
    private String endTime;
}
