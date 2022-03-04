package com.hantotem.property.domain.vo;

import com.hantotem.property.domain.entity.GaSacwAjxxb;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author geekerstar
 * @date 2021/3/24 13:59
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "StockOutSearchVO", description = "出库检索出参")
public class StockOutSearchVO {

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("出库检索案件查询列表")
    private List<GaSacwAjxxb> stockOutCaseList;
}
