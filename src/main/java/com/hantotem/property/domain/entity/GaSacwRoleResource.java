package com.hantotem.property.domain.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.*;
import lombok.Data;

/**
 * 角色关联资源配置表(GaSacwRoleResource)实体类
 *
 * @author zhangbo
 * @since 2021-07-08 15:34:35
 */
@Data
@ApiModel("角色关联资源配置表")
public class GaSacwRoleResource implements Serializable {

    private static final long serialVersionUID = -58075998733918043L;
    
    @ApiModelProperty("自编号(主键)")
    private Long zbh;
    
    @ApiModelProperty("账号类型(1：超级管理员|安管员，2：游客)")
    private Object zhlx;
    
    @ApiModelProperty("资源id")
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