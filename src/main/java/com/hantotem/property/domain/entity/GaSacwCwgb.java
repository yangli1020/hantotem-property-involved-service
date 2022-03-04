package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 储物柜表(GaSacwCwgb)实体类
 *
 * @author geekerstar
 * @since 2021-03-22 16:45:54
 */
@Data
@ApiModel("储物柜表")
public class GaSacwCwgb implements Serializable {

    private static final long serialVersionUID = -77899240264697270L;

    @ApiModelProperty("id")
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("所属单位编码")
    private String ssdwdm;

    @ApiModelProperty("所属单位名称")
    private String ssdwmc;

    @ApiModelProperty("区域编码")
    private String qybm;

    @ApiModelProperty("区域名称")
    private String qymc;

    @ApiModelProperty("柜子类型编码")
    private String gzlxbm;

    @ApiModelProperty("货架/储物柜/智能柜")
    private String gzlxmc;

    @ApiModelProperty("具体位置")
    private String jtwz;

    @ApiModelProperty("柜格锁号")
    private Integer lockNum;

    @ApiModelProperty("柜子ip")
    private String ipadress;

    @ApiModelProperty("状态")
    private Integer state;

    @ApiModelProperty("物品总量")
    private Long wpzl;

    @ApiModelProperty("是否显示屏(0不是显示屏：1是显示屏)")
    private Integer sfxsp;

    @ApiModelProperty("行数")
    private Integer hs;

    @ApiModelProperty("列数")
    private Integer ls;

    @ApiModelProperty("是否主柜(0不是主柜：1是主柜)")
    private Integer sfzg;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建人编号")
    private String createdCode;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("更新人")
    private String updatedBy;

    @ApiModelProperty("更新人编号")
    private String updatedCode;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

    @ApiModelProperty("锁控版号")
    private Integer skbh;

}
