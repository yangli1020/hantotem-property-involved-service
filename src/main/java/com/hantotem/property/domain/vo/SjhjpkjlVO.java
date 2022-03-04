package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "数据汇聚数据传输盘库记录")
public class SjhjpkjlVO implements Serializable {
    private static final long serialVersionUID = -1515165497891157410L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("盘库时间")
    private Date pksj;
    @ApiModelProperty("盘库数量")
    private Integer pksl;
    @ApiModelProperty("校准数量")
    private Integer jzsl;
    @ApiModelProperty("系统记录数量")
    private Integer xtjlsl;
    @ApiModelProperty("是否异常")
    private String sfycbm;
    @ApiModelProperty("所属部门编码")
    private String ssbmbm;
    @ApiModelProperty("所属部门名称")
    private String ssbmmc;
    @ApiModelProperty("盘库民警编号")
    private String pkrmjbh;
    @ApiModelProperty("盘库民警名称")
    private String pkrmjmc;
    @ApiModelProperty("盘库操作编号")
    private String czbh;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;

}
