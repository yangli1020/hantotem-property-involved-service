package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "AddPhotoVO", description = "添加人员信息VO")
public class AddPhotoVO {

    @ApiModelProperty(value = "id",required = true)
    private Long id;

    @ApiModelProperty(value = "rlzp")
    private String rlzp;

}
