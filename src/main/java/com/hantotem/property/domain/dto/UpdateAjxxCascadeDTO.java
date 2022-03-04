package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 级联更新案件信息 DTO
 * @since 2021/4/14 17:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateAjxxCascadeDTO {
    @ApiModelProperty(value = "案件编号")
    private String ajbh;
    @ApiModelProperty(value = "案件名称")
    private String ajmc;
    @ApiModelProperty(value = "案件主办单位代码")
    private String ajzbdwdm;
    @ApiModelProperty(value = "案件主办单位")
    private String ajzbdw;

    public UpdateAjxxCascadeDTO(String ajbh, String ajmc) {
        this.ajbh = ajbh;
        this.ajmc = ajmc;
    }
}
