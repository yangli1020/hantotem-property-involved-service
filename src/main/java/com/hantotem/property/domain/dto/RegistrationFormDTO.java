package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description
 * @since 2021/3/29 9:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationFormDTO implements Serializable {
    @ApiModelProperty("物品 id")
    private Long id;

    @ApiModelProperty("送取人")
    private String sqr;

    @ApiModelProperty("送取人民警编号")
    private String sqrmjbh;

    @ApiModelProperty("送取人联系方式")
    private String sqrlxfs;

    @ApiModelProperty("送取人所属单位")
    private String sqrssdw;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("物品编号")
    private String wpbh;

    @ApiModelProperty("物品名称")
    private String wpmc;

    @ApiModelProperty("物品种类代码")
    private String wpzldm;

    @ApiModelProperty("物品种类")
    private String wpzl;

    @ApiModelProperty("物品类型代码")
    private String wplxdm;

    @ApiModelProperty("物品类型")
    private String wplx;

    @ApiModelProperty("物品描述")
    private String wpms;

    @ApiModelProperty("数量")
    private String sl;

    @ApiModelProperty("计量单位代码")
    private String jldwdm;

    @ApiModelProperty("计量单位")
    private String jldw;

    @ApiModelProperty("实物图地址")
    private String swtdz;

    @ApiModelProperty("物品状态大类代码(1.在库/2.出库)")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类(1.在库/2.出库)")
    private String wpztdl;

    @ApiModelProperty("送取人签字")
    private String sqrqz;

    @ApiModelProperty("最新入库时间")
    private LocalDateTime zxrksj;

    @ApiModelProperty("最新出库时间")
    private LocalDateTime zxcksj;

}
