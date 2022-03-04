package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *     访客权限配置实体
 * </p>
 * @author Luosheng
 * @since 2021/7/8 11:27
 * @version 1.0.0
 */
@Data
@Builder
@ApiModel("访客权限配置")
public class GaSacwVisitor implements Serializable {

    @ApiModelProperty("自编号(主键)")
    @TableId(type = IdType.ASSIGN_ID)
    private Long zbh;

    @ApiModelProperty("警号")
    private String jh;

    @ApiModelProperty("姓名")
    private String xm;

    @ApiModelProperty("身份证号码")
    private String sfzh;

    @ApiModelProperty("登录人所属单位代码")
    private String dlrdwdm;

    @ApiModelProperty("登录人所属单位名称")
    private String dlrdwmc;

    @ApiModelProperty("可进入的单位代码")
    private String kjrdwdm;

    @ApiModelProperty("可进入的单位名称")
    private String kjrdwmc;

    @ApiModelProperty("账号类型(1：超级管理员|安管员，2：游客)")
    private Integer zhlx;

    @ApiModelProperty("账号类型名称")
    private String zhlxmc;

    @ApiModelProperty("是否启用(0：是，1：否)")
    private Integer sfqy;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建人编号")
    private String createdCode;

    @ApiModelProperty("创建时间")
    private Date createdTime;

    @ApiModelProperty("更新人")
    private String updatedBy;

    @ApiModelProperty("更新人编号")
    private String updatedCode;

    @ApiModelProperty("更新时间")
    private Date updatedTime;
}
