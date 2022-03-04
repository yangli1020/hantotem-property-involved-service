package com.hantotem.property.domain.dto;

import com.hantotem.property.domain.vo.ShelfVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author LiuXiangMin
 * @ClassName PresentStatisticDTO
 * @description TODO
 * @Date 2021/3/24 11:12
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PresentStatisticDTO implements Serializable {

    private static final long serialVersionUID = -1L;

    @ApiModelProperty(value = "库内物品数",example = "0")
    private Integer wps;

    @ApiModelProperty(value = "物品关联案件数",example = "0")
    private Integer ajs;

    @ApiModelProperty(value = "区域物品数")
    private List<ShelfVO> shelfVOS;

}
