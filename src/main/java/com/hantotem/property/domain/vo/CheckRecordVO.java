package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author geekerstar
 * @date 2021/3/25 17:08
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CheckRecordVO", description = "盘库记录出参")
public class CheckRecordVO {

    @ApiModelProperty("序号")
    private Integer xh;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("盘库时间")
    private Date pksj;

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
}
