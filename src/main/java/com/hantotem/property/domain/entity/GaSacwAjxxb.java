package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 案件信息表(GaSacwAjxxb)实体类
 *
 * @author geekerstar
 * @since 2021-03-22 16:45:52
 */
@Data
@ApiModel("案件信息表")
public class GaSacwAjxxb implements Serializable {

    private static final long serialVersionUID = 752490341004232260L;

    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("案件主办单位")
    private String ajzbdw;

    @ApiModelProperty("案件类型")
    private String ajlx;

    @ApiModelProperty("案件类型代码")
    private String ajlxdm;

    @ApiModelProperty("案件类别")
    private String ajlb;

    @ApiModelProperty("案件类别代码")
    private String ajlbdm;

    @ApiModelProperty("发案时间")
    private LocalDateTime fasj;

    @ApiModelProperty("受理时间")
    private LocalDateTime slsj;

    @ApiModelProperty("入库时间")
    private LocalDateTime rksj;

    @ApiModelProperty("办案人")
    private String bar;

    @ApiModelProperty("办案人民警编号")
    private String barmjbh;

    @ApiModelProperty("简要案情")
    private String jyaq;

    @ApiModelProperty(value = "创建人单位代码")
    private String cjrdwdm;

    @ApiModelProperty(value = "创建人单位")
    private String cjrdw;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建人编号")
    private String createdCode;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("更新人")
    private String updatedBy;

    @ApiModelProperty("更新人编号")
    private String updatedCode;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

}
