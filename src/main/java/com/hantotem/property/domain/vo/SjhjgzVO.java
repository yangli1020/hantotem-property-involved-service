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
@ApiModel(value = "数据汇聚数据传输柜子")
public class SjhjgzVO implements Serializable {
    private static final long serialVersionUID = -8371969472918820998L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("储物柜编码")
    private String cwgbm;
    @ApiModelProperty("格子编号")
    private String gzbh;
    @ApiModelProperty("格子名称")
    private String gzmc;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态（0正常，1删除，2停用）(1)")
    private Integer state;
}
