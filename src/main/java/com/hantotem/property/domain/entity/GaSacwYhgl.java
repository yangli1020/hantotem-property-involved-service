package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户管理(GaSacwYhgl)实体类
 *
 * @author geekerstar
 * @since 2021-03-22 16:45:54
 */
@Data
@ApiModel("用户管理")
public class GaSacwYhgl implements Serializable {

    private static final long serialVersionUID = 610207160932416778L;

    @TableId(type = IdType.AUTO)
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

    @ApiModelProperty("联系方式")
    private String lxfs;

    @ApiModelProperty("账号类型编码")
    private String zhlxbm;

    @ApiModelProperty("账号类型名称")
    private String zhlxmc;

    @ApiModelProperty("账号")
    private String zh;

    @ApiModelProperty("密码")
    private String mm;

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

    @ApiModelProperty(value="zhssdwdm账号所属单位代码")
    private String zhssdwdm;

    @ApiModelProperty(value="zhssdwmc账号所属单位名称")
    private String zhssdwmc;

}
