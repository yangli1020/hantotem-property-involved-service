package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 物品信息表(GaSacwWpxx)实体类
 *
 * @author geekerstar
 * @since 2021-03-22 16:45:54
 */
@Data
@ApiModel("物品信息表")
public class GaSacwWpxx implements Serializable {

    private static final long serialVersionUID = -27277057827361895L;

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

    @ApiModelProperty("送取人民警编号")
    private String sqrmjbh;

    @ApiModelProperty("送取人")
    private String sqr;

    @ApiModelProperty("送取人联系方式")
    private String sqrlxfs;

    @ApiModelProperty("送取人所属单位代码")
    private String sqrssdwdm;

    @ApiModelProperty("送取人所属单位")
    private String sqrssdw;

    @ApiModelProperty("操作编号")
    private String czbh;

    @ApiModelProperty("操作时间")
    private LocalDateTime czsj;

    @ApiModelProperty("物品唯一uuid")
    private String wpbh;

    @ApiModelProperty("存最新的")
    private String wprfid;

    @ApiModelProperty("物品名称")
    private String wpmc;

    @ApiModelProperty("物品种类代码")
    private String wpzldm;

    @ApiModelProperty("物品种类")
    private String wpzl;

    @ApiModelProperty("物品类型代码")
    private String wplxdm;

    @ApiModelProperty("物品类型")
    private String wplx;

    @ApiModelProperty("物品描述")
    private String wpms;

    @ApiModelProperty("数量")
    private String sl;

    @ApiModelProperty("计量单位代码")
    private String jldwdm;

    @ApiModelProperty("计量单位")
    private String jldw;

    @ApiModelProperty("实物图地址")
    private String swtdz;

    @ApiModelProperty("存放区域代码")
    private String cfqydm;

    @ApiModelProperty("存放区域")
    private String cfqy;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("是否预警")
    private Integer sfyj;

    @ApiModelProperty("物品状态大类代码(1.在库/2.出库)")
    private String wpztdldm;

    @ApiModelProperty("物品状态大类(1.在库/2.出库)")
    private String wpztdl;

    @ApiModelProperty("物品状态小类代码(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxldm;

    @ApiModelProperty("物品状态小类(1.登记入库未签字/2.登记入库/3.登记出库未签字/4.登记出库/5.异常出库)")
    private String wpztxl;

    @ApiModelProperty("接收单位代码")
    private String jsdwdm;

    @ApiModelProperty("接收单位")
    private String jsdw;

    @ApiModelProperty("柜端状态代码(1.待入库/2.已入库/3.待出库/4.已出库)")
    private String gdztdm;

    @ApiModelProperty("柜端状态代码(1.待入库/2.已入库/3.待出库/4.已出库)")
    private String gdztmc;

    @ApiModelProperty("最新入库时间")
    private LocalDateTime zxrksj;

    @ApiModelProperty("最新出库时间")
    private LocalDateTime zxcksj;

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
