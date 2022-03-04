package com.hantotem.property.domain.dto;

import com.hantotem.property.domain.entity.GaSacwCrkjlb;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author LiuXiangMin
 * @ClassName TodayStatisticDTO
 * @description 今日统计VO
 * @Date 2021/3/24 10:29
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodayStatisticDTO implements Serializable {

    private static final long serialVersionUID = -1L;

    @ApiModelProperty(value = "入库数(已入库状态总和),根据出入库次数统计",example = "0")
    private Long stockin;

    @ApiModelProperty(value = "出库数（出入库记录已出库状态总和），根据出入库次数进行统计",example = "0")
    private Long stockout;

    @ApiModelProperty(value = "在库数（已入库状态+待出库状态数量总和），根据物品件数统计",example = "0")
    private Long onstock;

    @ApiModelProperty(value = "累计出库数（物品已出库状态总和），根据物品件数统计",example = "0")
    private Long onstockout;

    @ApiModelProperty(value = "第一次入库数（日志表中只存在一条已入库状态的总和）",example = "0")
    private Long firstStockIn;

    @ApiModelProperty(value = "归库数（日志表中只存在一条以上已入库状态的总和）",example = "0")
    private Long returnStockIn;

    @ApiModelProperty(value = "异常数",example = "0")
    private Long warnNum;

    @ApiModelProperty(value = "出入库详细数据")
    private List<GaSacwCrkjlb>  gaSacwCrkjlbs;

}
