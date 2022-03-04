package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 盘库记录表(GaSacwPkjlb)实体类
 *
 * @author geekerstar
 * @since 2021-03-22 16:45:54
 */
@Data
@ApiModel("盘库记录表")
public class GaSacwPkjlb implements Serializable {

    private static final long serialVersionUID = 568282583977053737L;

    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("盘库时间")
    private LocalDateTime pksj;

    @ApiModelProperty("盘库数量")
    private Integer pksl;

    @ApiModelProperty("校准数量")
    private Integer jzsl;

    @ApiModelProperty("系统记录数量")
    private Integer xtjlsl;

    @ApiModelProperty("是否异常代码(0.正常/1.异常)")
    private Integer sfycdm;

    @ApiModelProperty("是否异常(0.正常/1.异常)")
    private String sfyc;

    @ApiModelProperty("所属单位代码")
    private String ssdwdm;

    @ApiModelProperty("所属单位名称")
    private String ssdwmc;

    @ApiModelProperty("盘库人民警编号")
    private String pkrmjbh;

    @ApiModelProperty("盘库人姓名")
    private String pkrxm;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("是否完成(0.未完成/1.完成)")
    private String sfwc;

    @ApiModelProperty("是否完成代码(0.未完成/1.完成)")
    private Integer sfwcdm;

    @ApiModelProperty("加一个是否完成盘库")
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
