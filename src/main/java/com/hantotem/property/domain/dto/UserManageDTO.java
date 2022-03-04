package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 用户管理 DTO
 * @since 2021/3/25 10:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "UserManageDTO", description = "用户管理 DTO")
public class UserManageDTO implements Serializable {
    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("警号")
    private String jh;

    @ApiModelProperty("职务")
    private String zw;

    @ApiModelProperty("所属单位代码")
    private String ssdwdm;

    @ApiModelProperty("所属单位名称")
    private String ssdwmc;

    @ApiModelProperty("姓名")
    private String xm;

    @ApiModelProperty("人脸照片")
    private String rlzp;

    @ApiModelProperty("性别: 0:女、1:男")
    private String xb;

    @ApiModelProperty("身份证号")
    private String sfzh;

    @ApiModelProperty("联系方式")
    private String lxfs;

    @ApiModelProperty("账号类型名称")
    private String zhlxmc;

    @ApiModelProperty("账号")
    private String zh;

    @ApiModelProperty("密码")
    private String mm;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("序号")
    private Integer index;
}
