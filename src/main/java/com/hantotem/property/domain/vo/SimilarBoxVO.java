package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 *     查询同一个柜子的物品信息
 * </p>
 * @author Luosheng
 * @since 2021/6/2 14:38
 * @version 1.0.0
 */
@Data
@ApiModel(value = "同一个柜子内物品信息")
public class SimilarBoxVO {

    @ApiModelProperty(value = "序号",example = "1")
    private String xh;

    @ApiModelProperty(value = "物品/包裹名称",example = "吸毒案")
    private String wpmc;

    @ApiModelProperty(value = "物品编号",example = "W1380323759805829120")
    private String wpbh;

    @ApiModelProperty(value = "具体位置",example = "1-1")
    private String jtwz;

    @ApiModelProperty(value = "锁号",example = "1")
    private Integer lockNum;
}
