package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author geekerstar
 * @date 2021/3/25 10:26
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ReceiveDataDTO", description = "接收数据入参")
public class ReceiveDataDTO {

    @NotBlank(message = "设备唯一标识不能为空")
    @ApiModelProperty("设备唯一标识")
    private String pdaId;

    @NotEmpty(message = "扫描出的RFID不能为空")
    @ApiModelProperty("扫描出的RFID")
    private List<String> smrfidList;

    @NotBlank(message = "当前登录人不能为空")
    @ApiModelProperty(value = "当前登录人", example = "张三")
    private String dlr;

    @NotBlank(message = "当前登录人民警编号不能为空")
    @ApiModelProperty(value = "当前登录人民警编号", example = "0123452")
    private String dlrmjbh;
}
