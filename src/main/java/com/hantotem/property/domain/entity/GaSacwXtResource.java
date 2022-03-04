package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *     系统资源实体
 * </p>
 * @author Luosheng
 * @since 2021/7/8 11:12
 * @version 1.0.0
 */
@Data
@Builder
@ApiModel("系统资源配置")
public class GaSacwXtResource implements Serializable {
    @ApiModelProperty("自编号(主键)")
    @TableId(type = IdType.ASSIGN_ID)
    private Long zbh;

    @ApiModelProperty("资源ID")
    private Integer resourceId;

    @ApiModelProperty("资源URL")
    private String url;

    @ApiModelProperty("资源名称")
    private String zymc;

    @ApiModelProperty("资源标识")
    private String zybs;

    @ApiModelProperty("资源类型(1：url，2：功能)")
    private Integer zylx;

    @ApiModelProperty("父级资源ID")
    private Integer parentId;

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
