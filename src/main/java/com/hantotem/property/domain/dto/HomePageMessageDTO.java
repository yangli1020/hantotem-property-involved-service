package com.hantotem.property.domain.dto;

import com.hantotem.property.domain.vo.DepartmentStatisticVO;
import com.hantotem.property.domain.vo.StorageTimeLagVO;
import com.hantotem.property.domain.vo.WarningDataVO;
import com.hantotem.property.domain.vo.WarningListVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author LiuXiangMin
 * @ClassName HomePageMessageDTO
 * @description TODO
 * @Date 2021/3/24 16:15
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomePageMessageDTO implements Serializable {

    private static final long serialVersionUID = -1L;

    @ApiModelProperty(value = "今日概览")
    private TodayStatisticDTO todayStatisticDTO;

    @ApiModelProperty(value = "当前库内概览")
    private PresentStatisticDTO presentStatisticDTO;

    @ApiModelProperty(value = "库内物品存放时长分布")
    private StorageTimeLagVO storageTimeLagVO;

    @ApiModelProperty(value = "各单位存放物品分布")
    private List<DepartmentStatisticVO> departmentStatisticVOS;

    @ApiModelProperty(value = "预警数据")
    private WarningDataVO warningDataVO;

    @ApiModelProperty(value = "预警列表数据")
    private List<WarningListVO> warningListVOS;

}
