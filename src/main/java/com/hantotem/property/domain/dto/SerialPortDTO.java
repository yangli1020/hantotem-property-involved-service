package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *     串口实体
 * </p>
 * @author Luosheng
 * @since 2021/6/4 10:14
 * @version 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "SerialPortDTO", description = "串口入参")
public class SerialPortDTO {

    @ApiModelProperty(value = "串口号", example = "COM2")
    private String serialNumber;

    @ApiModelProperty(value = "波特率", example = "9600")
    private Integer baudRate;

    @ApiModelProperty(value = "校验位", example = "0")
    private Integer checkoutBit;

    @ApiModelProperty(value = "数据位", example = "8")
    private Integer dataBit;

    @ApiModelProperty(value = "停止位", example = "1")
    private Integer stopBit;
}
