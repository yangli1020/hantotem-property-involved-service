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
@ApiModel(value = "数据汇聚数据传输摄像头信息")
public class SjhsxtsbxxjVO implements Serializable {
    private static final long serialVersionUID = -7625321912504771565L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("摄像头监控点编码")
    private String sbbm;
    @ApiModelProperty("摄像头监控点名称")
    private String sbmc;
    @ApiModelProperty("设备厂商")
    private String sbcs;
    @ApiModelProperty("设备ip")
    private String ip;
    @ApiModelProperty("设备端口")
    private Integer port;
    @ApiModelProperty("设备用户名")
    private String user_name;
    @ApiModelProperty("设备密码")
    private String password;
    @ApiModelProperty("摄像头是否录音（0否，1是，默认否）")
    private Integer sfly;
    @ApiModelProperty("所属nvr设备编码")
    private String nvrsbbm;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态（0正常，1删除，2停用）")
    private Integer state;
    @ApiModelProperty("国标通道编码")
    private String gbtdbm;
}
