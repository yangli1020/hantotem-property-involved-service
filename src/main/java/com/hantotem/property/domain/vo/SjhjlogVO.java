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
@ApiModel(value = "数据汇聚数据传输登陆")
public class SjhjlogVO implements Serializable {
    private static final long serialVersionUID = -7498457822842819669L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("登录用户名称")
    private String dlrmc;
    @ApiModelProperty("登录人编号")
    private String dlrbh;
    @ApiModelProperty("警号")
    private String jh;
    @ApiModelProperty("所属单位编码")
    private String ssdwbm;
    @ApiModelProperty("所属单位名称")
    private String ssdwmc;
    @ApiModelProperty("登录时间")
    private Date dlsj;
    @ApiModelProperty("登录IP")
    private String ip;
    @ApiModelProperty("职位")
    private String zw;
    @ApiModelProperty("联系方式")
    private String lxfs;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;
}
