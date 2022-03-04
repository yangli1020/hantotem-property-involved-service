package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "searchVO" ,description = "人员信息查询vo")
public class SearchVO {
    @ApiModelProperty(value = "身份证号")
    private String sfzh;
    @ApiModelProperty(value = "警号")
    private String jh;
}
