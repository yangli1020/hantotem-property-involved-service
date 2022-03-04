package com.hantotem.property.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value="GaSacwSxtsbxx")
public class GaSacwSxtsbxx {

    @ApiModelProperty(value="zbhzbh")
    @TableId(type = IdType.ASSIGN_ID)
    private Long zbh;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="cjsj创建时间")
    private Date cjsj;

    /**
     * 更新时间
     */
    @ApiModelProperty(value="gxsj更新时间")
    private Date gxsj;

    /**
     * 摄像头设备号
     */
    @ApiModelProperty(value="sxtsbh摄像头设备号")
    private String sxtsbh;

    /**
     * 摄像头名称
     */
    @ApiModelProperty(value="sxtmc摄像头名称")
    private String sxtmc;

    /**
     * ip地址
     */
    @ApiModelProperty(value="ipadressip地址")
    private String ipadress;

    /**
     * 摄像头所属单位代码
     */
    @ApiModelProperty(value="ssdwdm摄像头所属单位代码")
    private String ssdwdm;

    /**
     * 摄像头所属单位名称
     */
    @ApiModelProperty(value="ssdwmc摄像头所属单位名称")
    private String ssdwmc;

    /**
     * 启用状态
     */
    @ApiModelProperty(value="qyzt启用状态")
    private Integer qyzt;

    /**
     * 摄像头NVRIP
     */
    @ApiModelProperty(value="sxtnvrip摄像头NVRIP")
    private String sxtnvrip;

    /**
     * 通道号
     */
    @ApiModelProperty(value="tdh通道号")
    private String tdh;

    /**
     * 账号
     */
    @ApiModelProperty(value="username账号")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value="password密码")
    private String password;

    /**
     * nvr线路
     */
    @ApiModelProperty(value="nvrxlnvr线路")
    private String nvrxl;

    /**
     * 请求地址
     */
    @ApiModelProperty(value="qqdz请求地址")
    private String qqdz;

    /**
     * 摄像头是否有声音
     */
    @ApiModelProperty(value="sxtsfysy摄像头是否有声音")
    private Integer sxtsfysy;

    /**
     * 会话
     */
    @ApiModelProperty(value="session会话")
    private String session;

    /**
     * 协议
     */
    @ApiModelProperty(value="protocol协议")
    private String protocol;

    /**
     * 直播ip
     */
    @ApiModelProperty(value="host直播ip")
    private String host;

    /**
     * 令牌
     */
    @ApiModelProperty(value="token令牌")
    private String token;

    /**
     * 视频编码
     */
    @ApiModelProperty(value="spbm视频编码")
    private String spbm;

    /**
     * 摄像头类型。1=登记区，2=案管柜
     */
    @ApiModelProperty(value="sxtlx摄像头类型。1=登记区，2=案管柜")
    private Short sxtlx;

    /**
     * 摄像头序号(定义序号时有声音的一定要在前 如A B C 只有C有声音 那么就是 C B A顺序 C就命名为1 AB随意)
     */
    @ApiModelProperty(value="sxtxh摄像头序号(定义序号时有声音的一定要在前 如A B C 只有C有声音 那么就是 C B A顺序 C就命名为1 AB随意)")
    private Integer sxtxh;

    /**
     * 摄像头品牌
     */
    @ApiModelProperty(value="sxtpp摄像头品牌")
    private String sxtpp;

    /**
     * 摄像头端口号
     */
    @ApiModelProperty(value="sxtdkh摄像头端口号")
    private String sxtdkh;

    /**
     * 摄像头型号
     */
    @ApiModelProperty(value="cameratype摄像头型号")
    private String cameratype;

}