package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description
 * @since 2021/3/24 17:41
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "UserLoginDTO", description = "用户登录 DTO")
public class UserLoginDTO implements Serializable {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("警号")
    private String jh;

    @ApiModelProperty("职务")
    private String zw;

    @ApiModelProperty("所属单位编码")
    private String ssdwdm;

    @ApiModelProperty("所属单位名称")
    private String ssdwmc;

    @ApiModelProperty("姓名")
    private String xm;

    @ApiModelProperty("联系方式")
    private String lxfs;

    @ApiModelProperty("账号类型编码")
    private String zhlxbm;

    @ApiModelProperty("账号类型名称")
    private String zhlxmc;

    @ApiModelProperty("账号")
    private String zh;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("人脸照片")
    private String rlzp;

    @ApiModelProperty("身份证号")
    private String sfzh;

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

    @ApiModelProperty("token")
    private String token;

    @ApiModelProperty("真实的单位代码")
    private String zhssdwdm;

    @ApiModelProperty("真实的单位名称")
    private String zhssdwmc;
}
