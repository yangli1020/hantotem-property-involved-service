package com.hantotem.property.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;

import java.util.Date;

@Builder
@ApiModel(value="com.hantotem.domain.entity.GaXtRyrzdwb")
public class GaXtRyrzdwb {
    @ApiModelProperty(value="xh序号")
    private Integer xh;

    @ApiModelProperty(value="mjbh民警编号")
    private String mjbh;

    @ApiModelProperty(value="rzjgdm任职机关单位编号")
    private String rzjgdm;

    @ApiModelProperty(value="rzjgmc任职机关单位名称")
    private String rzjgmc;

    @ApiModelProperty(value="zw职位")
    private String zw;

    @ApiModelProperty(value="rzrq任职日期")
    private Date rzrq;

    @ApiModelProperty(value="rzzt任职状态")
    private Short rzzt;

    @ApiModelProperty(value="ifky是否可用，1可用")
    private String ifky;

    @ApiModelProperty(value="rzjgmc2任职机关单位原始名称")
    private String rzjgmc2;

    @ApiModelProperty(value="dcqx督察权限，为0或空不具有督察权限，为普通部门，为1为法制部门可以推送数据，为2为督察部门，可抽取、督察数据")
    private Integer dcqx;

    @ApiModelProperty(value="sfzrdw是否主任单位(1.是 0否)")
    private Integer sfzrdw;

    @ApiModelProperty(value="sfbdwld是否本单位领导(1.是 0否)")
    private String sfbdwld;

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getMjbh() {
        return mjbh;
    }

    public void setMjbh(String mjbh) {
        this.mjbh = mjbh;
    }

    public String getRzjgdm() {
        return rzjgdm;
    }

    public void setRzjgdm(String rzjgdm) {
        this.rzjgdm = rzjgdm;
    }

    public String getRzjgmc() {
        return rzjgmc;
    }

    public void setRzjgmc(String rzjgmc) {
        this.rzjgmc = rzjgmc;
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    public Date getRzrq() {
        return rzrq;
    }

    public void setRzrq(Date rzrq) {
        this.rzrq = rzrq;
    }

    public Short getRzzt() {
        return rzzt;
    }

    public void setRzzt(Short rzzt) {
        this.rzzt = rzzt;
    }

    public String getIfky() {
        return ifky;
    }

    public void setIfky(String ifky) {
        this.ifky = ifky;
    }

    public String getRzjgmc2() {
        return rzjgmc2;
    }

    public void setRzjgmc2(String rzjgmc2) {
        this.rzjgmc2 = rzjgmc2;
    }

    public Integer getDcqx() {
        return dcqx;
    }

    public void setDcqx(Integer dcqx) {
        this.dcqx = dcqx;
    }

    public Integer getSfzrdw() {
        return sfzrdw;
    }

    public void setSfzrdw(Integer sfzrdw) {
        this.sfzrdw = sfzrdw;
    }

    public String getSfbdwld() {
        return sfbdwld;
    }

    public void setSfbdwld(String sfbdwld) {
        this.sfbdwld = sfbdwld;
    }
}
