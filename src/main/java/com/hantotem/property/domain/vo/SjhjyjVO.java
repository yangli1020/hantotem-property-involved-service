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
@ApiModel(value = "数据汇聚数据传输预警")
public class SjhjyjVO implements Serializable {
    private static final long serialVersionUID = 4894506815198167618L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("出入库记录编号")
    private String crkjlbh;
    @ApiModelProperty("物品编号")
    private String wpbh;
    @ApiModelProperty("预警编号")
    private String yjbh;
    @ApiModelProperty("预警时间")
    private Date yjsj;
    @ApiModelProperty("预警类型编码(200)")
    private String yjlxbm;
    @ApiModelProperty("视频地址")
    private String spdz;
    @ApiModelProperty("异常开始时间")
    private Date yckssj;
    @ApiModelProperty("异常截止时间")
    private Date ycjzsj;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;
}
