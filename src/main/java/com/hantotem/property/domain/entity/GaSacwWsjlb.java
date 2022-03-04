package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 文书记录表(GaSacwWsjlb)实体类
 *
 * @author geekerstar
 * @since 2021-03-22 16:45:54
 */
@Data
@ApiModel("文书记录表")
public class GaSacwWsjlb implements Serializable {

    private static final long serialVersionUID = -79983209921975548L;

    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("案件编号")
    private String ajbh;

    @ApiModelProperty("案件名称")
    private String ajmc;

    @ApiModelProperty("案件主办单位代码")
    private String ajzbdwdm;

    @ApiModelProperty("案件主办单位")
    private String ajzbdw;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @ApiModelProperty("文书地址")
    private String wsdz;

    @ApiModelProperty("文书类型1-入库文书；2-领取文书")
    private Integer wslx;

    @ApiModelProperty("状态")
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
