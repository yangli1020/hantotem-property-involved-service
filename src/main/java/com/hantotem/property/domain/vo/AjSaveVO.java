package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 案件添加 VO
 * @since 2021/4/14 15:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "AjSaveVO", description = "案件保存 VO")
public class AjSaveVO implements Serializable {

    @ApiModelProperty("序号")
    private Integer xh;

    @ApiModelProperty("登录人账号")
    private String account;

    @ApiModelProperty(value = "案件编号", required = true)
    @NotBlank
    private String ajbh;

    @ApiModelProperty(value = "案件名称", required = true)
    @NotBlank
    private String ajmc;

    @ApiModelProperty(value = "简要案情", required = true)
    @NotBlank
    private String jyaq;

    @ApiModelProperty(value = "案件主办单位代码", required = true)
    @NotBlank
    private String ajzbdwdm;

    @ApiModelProperty(value = "案件主办单位", required = true)
    @NotBlank
    private String ajzbdw;

    @ApiModelProperty(value = "创建人单位代码", required = true)
    @NotBlank
    private String cjrdwdm;

    @ApiModelProperty(value = "创建人单位", required = true)
    @NotBlank
    private String cjrdw;

    @ApiModelProperty(value = "案件类型", required = true)
    @NotBlank
    private String ajlx;

    @ApiModelProperty(value = "案件类型代码", required = true)
    @NotBlank
    private String ajlxdm;

    @ApiModelProperty(value = "案件类别", required = true)
    @NotBlank
    private String ajlb;

    @ApiModelProperty(value = "案件类别代码", required = true)
    @NotBlank
    private String ajlbdm;

    @ApiModelProperty(value = "受理时间", required = true)
    private LocalDateTime slsj;

    @ApiModelProperty(value = "入库时间，这个是数据展示时需要的，添加时不需要填写")
    private LocalDateTime rksj;

    @ApiModelProperty(value = "办案人", required = true)
    @NotBlank
    private String bar;

    @ApiModelProperty(value = "办案人民警编号", required = true)
    private String barmjbh;

    @ApiModelProperty(value = "是否是修改，false：添加（默认）、true：修改。该字段用于添加或修改时，数据展示时忽略", example = "false")
    private Boolean update;
}
