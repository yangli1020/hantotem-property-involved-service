package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 添加用户（配置账号） VO
 * @since 2021/3/25 15:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "UserAddVO", description = "配置用户 VO")
public class UserAddVO implements Serializable {

    @ApiModelProperty(value = "姓名")
    @NotBlank
    private String xm;

    @ApiModelProperty(value = "警号")
    @NotBlank
    private String jh;

    @ApiModelProperty(value = "身份证号")
    @NotBlank
    @Size(min = 18, max = 18, message = "身份证号只能是 18 位")
    private String sfzh;

    @ApiModelProperty(value = "职务")
    @NotBlank
    private String zw;

    @ApiModelProperty(value = "所属单位代码")
    @NotBlank
    private String ssdwdm;

    @ApiModelProperty(value = "所属单位名称")
    @NotBlank
    private String ssdwmc;

    @ApiModelProperty(value = "联系方式")
    @Size(max = 11, message = "长度不得大于 11")
    private String lxfs;

    @ApiModelProperty(value = "账号类型编码")
    @NotBlank
    private String zhlxbm;

    @ApiModelProperty(value = "账号类型名称")
    @NotBlank
    private String zhlxmc;

    @ApiModelProperty(value = "账号")
    @NotBlank
    private String zh;

    @ApiModelProperty("密码（初始为 123456）")
    private String mm;

    @ApiModelProperty(value = "人脸照片")
    @NotBlank
    private String rlzp;

    @ApiModelProperty("登录人警号")
    @NotBlank
    private String dlrjh;

    @ApiModelProperty(value="zhssdwdm账号所属单位代码")
    @NotBlank(message = "账号所属单位代码不能为空")
    private String zhssdwdm;

    @ApiModelProperty(value="zhssdwmc账号所属单位名称")
    @NotBlank(message = "账号所属单位名称不能为空")
    private String zhssdwmc;


}
