package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author <a href="mailto:bo.zhang@hantotem.com">zhangbo</a>
 * @version v 0.1
 * @since 2021年07月08日 15:31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "PermissionResourceVO", description = "权限资源返回参数")
public class PermissionResourceVO {

    @ApiModelProperty("资源ID")
    private Integer resourceId;

    @ApiModelProperty("资源名称")
    private String zymc;

    @ApiModelProperty("资源标识")
    private String zybs;

    @ApiModelProperty(value = "权限状态(0.不可见、1.可见、2.可见不可点击)", example = "0")
    private Integer showState;

    @ApiModelProperty(value = "资源URL", example = "/normal/GoodsWarningList")
    private String url;

    @ApiModelProperty("资源类型(1：url，2：功能)")
    private Integer zylx;
}
