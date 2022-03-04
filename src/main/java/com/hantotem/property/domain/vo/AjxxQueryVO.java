package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AjxxQueryVO {

    @ApiModelProperty(value = "序号",example = "1")
    private Integer xh;

    @ApiModelProperty(value = "案件编号",example = "A5301117000002019090234")
    private String ajbh;

    @ApiModelProperty(value = "案件名称",example = "邱先军被盗窃案")
    private String ajmc;

    @ApiModelProperty(value = "案件主办单位名代码",example = "530111490000")
    private String ajzbdwdm;

    @ApiModelProperty(value = "案件主办单位名称",example = "云南省昆明市公安局官渡分局世纪城派出所")
    private String ajzbdw;
}
