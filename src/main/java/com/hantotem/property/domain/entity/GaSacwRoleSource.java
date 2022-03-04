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
 *     角色关联资源实体
 * </p>
 * @author Luosheng
 * @since 2021/7/8 11:25
 * @version 1.0.0
 */
@Data
@Builder
@ApiModel("角色关联资源")
public class GaSacwRoleSource implements Serializable {

    @ApiModelProperty("自编号(主键)")
    @TableId(type = IdType.ASSIGN_ID)
    private Long zbh;

    @ApiModelProperty("账号类型(1：超级管理员|安管员，2：游客)")
    private Integer zhlx;

    @ApiModelProperty("资源ID")
    private Integer resourceId;

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
