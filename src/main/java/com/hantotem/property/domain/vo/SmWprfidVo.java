package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SmWprfidVo {
    @ApiModelProperty(value = "序号",example = "1")
    private Integer xh;

    @ApiModelProperty(value = "案件编号",example = "A5301117000002019090234")
    private String ajbh;

    @ApiModelProperty(value = "案件名称",example = "邱先军被盗窃案")
    private String ajmc;

    @ApiModelProperty(value = "物品/包裹名称",example = "吸毒案")
    private String wpmc;

    @ApiModelProperty(value = "物品编号",example = "W1380323759805829120")
    private String wpbh;

    @ApiModelProperty(value = "具体位置",example = "1-1")
    private String jtwz;

    @ApiModelProperty(value = "锁号",example = "1")
    private Integer lockNum;

    @ApiModelProperty(value = "是否可以入库(true：可以入库|false：不可入库)",example = "true")
    private boolean kyrk;
}
