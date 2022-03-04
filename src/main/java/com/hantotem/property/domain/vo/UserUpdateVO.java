package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 修改用户（配置账号） VO
 * @since 2021/3/25 15:56
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "UserUpdateVO", description = "修改用户 VO")
public class UserUpdateVO implements Serializable {

    @ApiModelProperty(value = "id",required = true)
    @NonNull
    private Long id;

    @ApiModelProperty(value = "姓名",required = true)
    @NotBlank
    private String xm;

    @ApiModelProperty(value = "警号",required = true)
    @NotBlank
    private String jh;

    @ApiModelProperty("登录人警号")
    @NotBlank
    private String dlrjh;

    @ApiModelProperty(value = "身份证号",required = true)
    @NotBlank
    @Size(min = 18, max = 18, message = "身份证号只能是 18 位")
    private String sfzh;

    @ApiModelProperty(value = "职务",required = true)
    @NotBlank
    private String zw;

    @ApiModelProperty(value = "所属单位代码",required = true)
    @NotBlank
    private String ssdwdm;

    @ApiModelProperty(value = "所属单位名称",required = true)
    @NotBlank
    private String ssdwmc;

    @ApiModelProperty(value = "联系方式",required = true)
    @Size(max = 11, message = "长度不得大于 11")
    private String lxfs;

    @ApiModelProperty(value = "账号类型编码",required = true)
    private String zhlxbm;

    @ApiModelProperty(value = "账号类型名称",required = true)
    private String zhlxmc;

    @ApiModelProperty(value = "账号",required = true)
    @NotBlank
    private String zh;

    @ApiModelProperty(value = "密码")
    private String mm;

    @ApiModelProperty(value = "人脸照片",required = true)
    @NotBlank
    private String rlzp;

}
