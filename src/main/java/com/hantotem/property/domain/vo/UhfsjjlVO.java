package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 采集器数据记录 VO
 * @since 2021/4/15 17:19
 */
@Data
@ApiModel(value = "UhfsjjlVO", description = "采集器数据记录 VO")
public class UhfsjjlVO {
    @ApiModelProperty(value = "采集器 ip", required = true,example = "192.168.1.87")
    @NotBlank
    private String uhfip;

    @ApiModelProperty(value = "标签 frid", required = true,example = "1234124123")
    @NotBlank
    private String wprfid;

    @ApiModelProperty(value = "天线编号",example = "1")
    private Integer txbh;

    @ApiModelProperty(value = "设备所在房间",example = "审询室")
    private String room;

    @ApiModelProperty(value = "RSSI1 强度",example = "12")
    private Integer rssi1;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UhfsjjlVO uhfsjjlVO = (UhfsjjlVO) o;
        return Objects.equals(uhfip, uhfsjjlVO.uhfip) &&
                Objects.equals(wprfid, uhfsjjlVO.wprfid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uhfip, wprfid);
    }
}
