package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * <p>
 *     查询单位柜体ipVO对象
 * </p>
 * @author Luosheng
 * @since 2021/6/7 15:01
 * @version 1.0.0
 */
@Data
public class PhotoAndCabinetIpVO {

    @ApiModelProperty(value = "柜体ip",example = "192.168.1.98")
    private List<String> cabinetIp;

    @ApiModelProperty(value = "人脸识别图片地址",example = "http://192.168.1.202:8001/zhangwen.png")
    private String url;
}
