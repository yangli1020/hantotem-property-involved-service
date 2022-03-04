package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 搜索时返回的 物品信息 实体类
 * @since 2021/3/22 17:10
 */
@Data
@ApiModel("物品信息搜索 DTO")
public class GaSacwWpxxSearchDTO implements Serializable {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("物品编号")
    private String wpbh;

    @ApiModelProperty("物品名称")
    private String wpmc;

    @ApiModelProperty("物品描述")
    private String wpms;

    @ApiModelProperty("数量")
    private String sl;

    @ApiModelProperty("计量单位")
    private String jldw;

    @ApiModelProperty("实物图地址")
    private String swtdz;

    @ApiModelProperty("存放区域代码")
    private String cfqydm;

    @ApiModelProperty("存放区域")
    private String cfqy;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("是否预警")
    private String sfyj;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

    @ApiModelProperty("物品状态大类代码(1.在库/2.出库)")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类(1.在库/2.出库)")
    private String wpztdl;

    @ApiModelProperty("物品状态小类代码(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxldm;

    @ApiModelProperty("物品状态小类(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxl;

    @ApiModelProperty("序号")
    private Integer index;
}
