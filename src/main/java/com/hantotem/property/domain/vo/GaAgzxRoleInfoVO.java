package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class GaAgzxRoleInfoVO {

    @ApiModelProperty(value="zbh自编号")
    private Long zbh;

    @ApiModelProperty(value="cjsj创建时间")
    private Date cjsj;

    @ApiModelProperty(value="gxsj更新时间")
    private Date gxsj;

    @ApiModelProperty(value="roleid角色id")
    private Integer roleid;

    @ApiModelProperty(value="mjbh民警编号")
    private String mjbh;

    @ApiModelProperty(value="type角色类型")
    private String type;

    @ApiModelProperty(value="typecode角色类型代码")
    private Short typecode;

    public Long getZbh() {
        return zbh;
    }

    public void setZbh(Long zbh) {
        this.zbh = zbh;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getMjbh() {
        return mjbh;
    }

    public void setMjbh(String mjbh) {
        this.mjbh = mjbh;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getTypecode() {
        return typecode;
    }

    public void setTypecode(Short typecode) {
        this.typecode = typecode;
    }
}
