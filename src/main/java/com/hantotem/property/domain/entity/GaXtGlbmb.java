package com.hantotem.property.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

@ApiModel(value="com.hantotem.domain.entity.GaXtGlbmb")
@ToString
public class GaXtGlbmb {
    @ApiModelProperty(value="xh序号")
    private Integer xh;

    @ApiModelProperty(value="dm单位编号")
    private String dm;

    @ApiModelProperty(value="mc单位名称")
    private String mc;

    @ApiModelProperty(value="py单位拼音")
    private String py;

    @ApiModelProperty(value="xzqh性质区划")
    private String xzqh;

    @ApiModelProperty(value="sjjgdm上级单位编号")
    private String sjjgdm;

    @ApiModelProperty(value="jz警种编号")
    private Integer jz;

    @ApiModelProperty(value="sjjb数据层级")
    private String sjjb;

    @ApiModelProperty(value="bmcj部门层级")
    private Integer bmcj;

    @ApiModelProperty(value="sj1jdwid市局1级单位id")
    private String sj1jdwid;

    @ApiModelProperty(value="sj2jdwid市局2级单位id")
    private String sj2jdwid;

    @ApiModelProperty(value="sj3jdwid市局3级单位id")
    private String sj3jdwid;

    @ApiModelProperty(value="sj4jdwid市局4级单位id")
    private String sj4jdwid;

    @ApiModelProperty(value="sj5jdwid市级5级单位id")
    private String sj5jdwid;

    @ApiModelProperty(value="sj1jdwmc市局1级单位名称")
    private String sj1jdwmc;

    @ApiModelProperty(value="sj2jdwmc市局2级单位名称")
    private String sj2jdwmc;

    @ApiModelProperty(value="sj3jdwmc市局3级单位名称")
    private String sj3jdwmc;

    @ApiModelProperty(value="sj4jdwmc市局4级单位名称")
    private String sj4jdwmc;

    @ApiModelProperty(value="sj5jdwmc市局5级单位名称")
    private String sj5jdwmc;

    @ApiModelProperty(value="sfzsbm是否为直属部门")
    private Integer sfzsbm;

    @ApiModelProperty(value="qxdwbh数据查询同步单位编号")
    private String qxdwbh;

    @ApiModelProperty(value="bmbz部门标志")
    private Integer bmbz;

    @ApiModelProperty(value="dwqc单位全称")
    private String dwqc;

    @ApiModelProperty(value="jlbz记录标志，1正常，0撤销")
    private String jlbz;

    @ApiModelProperty(value="zjjz自建警种")
    private String zjjz;

    @ApiModelProperty(value="jzqxdwdm警种单位权限代码")
    private String jzqxdwdm;

    @ApiModelProperty(value="dwqc2单位完整全称")
    private String dwqc2;

    @ApiModelProperty(value="jzxl警种细类")
    private String jzxl;

    @ApiModelProperty(value="sjywglbm上级业务管理部门")
    private String sjywglbm;

    @ApiModelProperty(value="ywcj当前部门业务层级 1-省法制支队；2-市局法制支队；3-分局法治大队")
    private String ywcj;

    @ApiModelProperty(value="ywzl业务种类 1-法制业务")
    private String ywzl;

    @ApiModelProperty(value="sjywglbmmc上级业务管理部门名称")
    private String sjywglbmmc;

    @ApiModelProperty(value="sfktbaqfw是否开通办案区服务 ")
    private Integer sfktbaqfw;

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getXzqh() {
        return xzqh;
    }

    public void setXzqh(String xzqh) {
        this.xzqh = xzqh;
    }

    public String getSjjgdm() {
        return sjjgdm;
    }

    public void setSjjgdm(String sjjgdm) {
        this.sjjgdm = sjjgdm;
    }

    public Integer getJz() {
        return jz;
    }

    public void setJz(Integer jz) {
        this.jz = jz;
    }

    public String getSjjb() {
        return sjjb;
    }

    public void setSjjb(String sjjb) {
        this.sjjb = sjjb;
    }

    public Integer getBmcj() {
        return bmcj;
    }

    public void setBmcj(Integer bmcj) {
        this.bmcj = bmcj;
    }

    public String getSj1jdwid() {
        return sj1jdwid;
    }

    public void setSj1jdwid(String sj1jdwid) {
        this.sj1jdwid = sj1jdwid;
    }

    public String getSj2jdwid() {
        return sj2jdwid;
    }

    public void setSj2jdwid(String sj2jdwid) {
        this.sj2jdwid = sj2jdwid;
    }

    public String getSj3jdwid() {
        return sj3jdwid;
    }

    public void setSj3jdwid(String sj3jdwid) {
        this.sj3jdwid = sj3jdwid;
    }

    public String getSj4jdwid() {
        return sj4jdwid;
    }

    public void setSj4jdwid(String sj4jdwid) {
        this.sj4jdwid = sj4jdwid;
    }

    public String getSj5jdwid() {
        return sj5jdwid;
    }

    public void setSj5jdwid(String sj5jdwid) {
        this.sj5jdwid = sj5jdwid;
    }

    public String getSj1jdwmc() {
        return sj1jdwmc;
    }

    public void setSj1jdwmc(String sj1jdwmc) {
        this.sj1jdwmc = sj1jdwmc;
    }

    public String getSj2jdwmc() {
        return sj2jdwmc;
    }

    public void setSj2jdwmc(String sj2jdwmc) {
        this.sj2jdwmc = sj2jdwmc;
    }

    public String getSj3jdwmc() {
        return sj3jdwmc;
    }

    public void setSj3jdwmc(String sj3jdwmc) {
        this.sj3jdwmc = sj3jdwmc;
    }

    public String getSj4jdwmc() {
        return sj4jdwmc;
    }

    public void setSj4jdwmc(String sj4jdwmc) {
        this.sj4jdwmc = sj4jdwmc;
    }

    public String getSj5jdwmc() {
        return sj5jdwmc;
    }

    public void setSj5jdwmc(String sj5jdwmc) {
        this.sj5jdwmc = sj5jdwmc;
    }

    public Integer getSfzsbm() {
        return sfzsbm;
    }

    public void setSfzsbm(Integer sfzsbm) {
        this.sfzsbm = sfzsbm;
    }

    public String getQxdwbh() {
        return qxdwbh;
    }

    public void setQxdwbh(String qxdwbh) {
        this.qxdwbh = qxdwbh;
    }

    public Integer getBmbz() {
        return bmbz;
    }

    public void setBmbz(Integer bmbz) {
        this.bmbz = bmbz;
    }

    public String getDwqc() {
        return dwqc;
    }

    public void setDwqc(String dwqc) {
        this.dwqc = dwqc;
    }

    public String getJlbz() {
        return jlbz;
    }

    public void setJlbz(String jlbz) {
        this.jlbz = jlbz;
    }

    public String getZjjz() {
        return zjjz;
    }

    public void setZjjz(String zjjz) {
        this.zjjz = zjjz;
    }

    public String getJzqxdwdm() {
        return jzqxdwdm;
    }

    public void setJzqxdwdm(String jzqxdwdm) {
        this.jzqxdwdm = jzqxdwdm;
    }

    public String getDwqc2() {
        return dwqc2;
    }

    public void setDwqc2(String dwqc2) {
        this.dwqc2 = dwqc2;
    }

    public String getJzxl() {
        return jzxl;
    }

    public void setJzxl(String jzxl) {
        this.jzxl = jzxl;
    }

    public String getSjywglbm() {
        return sjywglbm;
    }

    public void setSjywglbm(String sjywglbm) {
        this.sjywglbm = sjywglbm;
    }

    public String getYwcj() {
        return ywcj;
    }

    public void setYwcj(String ywcj) {
        this.ywcj = ywcj;
    }

    public String getYwzl() {
        return ywzl;
    }

    public void setYwzl(String ywzl) {
        this.ywzl = ywzl;
    }

    public String getSjywglbmmc() {
        return sjywglbmmc;
    }

    public void setSjywglbmmc(String sjywglbmmc) {
        this.sjywglbmmc = sjywglbmmc;
    }

    public Integer getSfktbaqfw() {
        return sfktbaqfw;
    }

    public void setSfktbaqfw(Integer sfktbaqfw) {
        this.sfktbaqfw = sfktbaqfw;
    }
}