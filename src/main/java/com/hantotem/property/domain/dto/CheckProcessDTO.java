package com.hantotem.property.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author geekerstar
 * @date 2021/3/25 15:37
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CheckProcessDTO", description = "盘库处理入参")
public class CheckProcessDTO {

    @NotNull(message = "操作类型不能为空")
    @ApiModelProperty(value = "操作类型(0.结束盘点/1.标记正常/2.登记入库/3.登记出库)", example = "1")
    private Integer czlx;

    @ApiModelProperty(value = "盘库物品列表，传多个相当于批量操作", example = "")
    private List<CheckProcessSubDTO> itemList;

    @NotBlank(message = "操作编号不能为空")
    @ApiModelProperty(value = "操作编号", example = "C1374617457729343488")
    private String czbh;

    @NotBlank(message = "当前登录人不能为空")
    @ApiModelProperty(value = "当前登录人", example = "张三")
    private String dlr;

    @NotBlank(message = "当前登录人民警编号不能为空")
    @ApiModelProperty(value = "当前登录人民警编号", example = "0123452")
    private String dlrmjbh;

    @NotBlank(message = "当前登录人所属单位代码不能为空")
    @ApiModelProperty(value = "当前登录人所属单位代码", example = "53010002323")
    private String dlrssdwdm;

    @NotBlank(message = "当前登录人所属单位不能为空")
    @ApiModelProperty(value = "当前登录人所属单位", example = "法制支队")
    private String dlrssdw;

    @ApiModelProperty(value = "操作类型为2/3才传：文书地址", example = "文书地址JSON")
    private String wsdz;

    @ApiModelProperty(value = "操作类型为2/3才传：送取人签字图片地址", example = "签字图片JSON")
    private String sqrqz;

    @ApiModelProperty(value = "操作类型为2/3才传：送取人民警编号", example = "111111")
    private String sqrmjbh;

    @ApiModelProperty(value = "操作类型为2/3才传：送取人", example = "张三")
    private String sqr;

    @ApiModelProperty(value = "操作类型为2/3才传：送取人联系方式", example = "18227663923")
    private String sqrlxfs;

    @ApiModelProperty(value = "操作类型为2/3才传：送取人所属单位代码", example = "12312313123")
    private String sqrssdwdm;

    @ApiModelProperty(value = "操作类型为2/3才传：送取人所属单位", example = "法制支队")
    private String sqrssdw;

}
