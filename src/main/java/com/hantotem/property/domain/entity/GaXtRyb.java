package com.hantotem.property.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="com.hantotem.domain.entity.GaXtRyb")
public class GaXtRyb {
    @ApiModelProperty(value="xh序号")
    private Integer xh;

    @ApiModelProperty(value="mjbh民警编号")
    private String mjbh;

    @ApiModelProperty(value="xm名称")
    private String xm;

    @ApiModelProperty(value="jh警号")
    private String jh;

    @ApiModelProperty(value="sfzh省份证号")
    private String sfzh;

    @ApiModelProperty(value="pswnull")
    private String psw;

    @ApiModelProperty(value="sjhm手机号码")
    private String sjhm;

    @ApiModelProperty(value="ifky是否可用，1可用")
    private String ifky;

    @ApiModelProperty(value="jlbz记录标志")
    private String jlbz;

    @ApiModelProperty(value="jp姓名简拼")
    private String jp;

    @ApiModelProperty(value="性别")
    private String xb;

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

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getJh() {
        return jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getIfky() {
        return ifky;
    }

    public void setIfky(String ifky) {
        this.ifky = ifky;
    }

    public String getJlbz() {
        return jlbz;
    }

    public void setJlbz(String jlbz) {
        this.jlbz = jlbz;
    }

    public String getJp() {
        return jp;
    }

    public void setJp(String jp) {
        this.jp = jp;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }
}
