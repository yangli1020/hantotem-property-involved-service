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
@ApiModel(value = "数据汇聚数据传输出库入记录")
public class SjhjcrkjlVO implements Serializable {
    private static final long serialVersionUID = -7071463606426659098L;
    @ApiModelProperty("业务主键")
    private String ywzj;
    @ApiModelProperty("系统编码")
    private String xtbm;
    @ApiModelProperty("数据操作")
    private String operation_flag;
    @ApiModelProperty("物品编号")
    private String wpbh;
    @ApiModelProperty("出入库记录编号")
    private String crkjlbh;
    @ApiModelProperty("案件编号")
    private String ajbh;
    @ApiModelProperty("案件名称")
    private String ajmc;
    @ApiModelProperty("出入库民警编号")
    private String crkmjbh;
    @ApiModelProperty("出入库民警名称")
    private String crkmjmc;
    @ApiModelProperty("出入库人员联系方式")
    private String crkrylxfs;
    @ApiModelProperty("出入库民警部门编码")
    private String chkrybmbm;
    @ApiModelProperty("出入库民警部门名称")
    private String chkrybmmc;
    @ApiModelProperty("操作时间")
    private Date czsj;
    @ApiModelProperty("柜子操作开始时间")
    private Date gzczkssj;
    @ApiModelProperty("柜子操作结束时间")
    private Date gzczjssj;
    @ApiModelProperty("物品名称")
    private String wpmc;
    @ApiModelProperty("储物柜编号（和储物柜表进行关联）")
    private String cwgbh;
    @ApiModelProperty("储物柜名称（和储物柜表进行关联）")
    private String cwgmc;
    @ApiModelProperty("格子编号")
    private String gzbh;
    @ApiModelProperty("操作类型编码（1入库，2出库）")
    private String czlxbm;
    @ApiModelProperty("出入库状态编码（")
    private String crkztbm;
    @ApiModelProperty("文书编号")
    private String wsbh;
    @ApiModelProperty("文书名称")
    private String wsmc;
    @ApiModelProperty("文书地址")
    private String wsdz;
    @ApiModelProperty("业务数据创建时间")
    private Date cjsj;
    @ApiModelProperty("业务数据更新时间")
    private Date gxsj;
    @ApiModelProperty("数据状态")
    private Integer state;
    @ApiModelProperty("出入库民警签字URL")
    private String crkmjqzurl;

}
