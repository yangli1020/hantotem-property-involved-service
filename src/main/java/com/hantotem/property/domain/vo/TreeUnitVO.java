package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class TreeUnitVO {
	/**
	 * 部门编号
	 */
	@ApiModelProperty("部门编号")
	private String unitid;
	/**
	 * 部门名称
	 */
	@ApiModelProperty("部门名称")
	private String unitname;
	/**
	 * 部门全称
	 */
	@ApiModelProperty("部门全称")
	private String dwqc;
	/**
	 * 首拼
	 */
	@ApiModelProperty("首拼")
	private String sp;
	/**
	 * 上级部门编号
	 */
	@ApiModelProperty("上级部门编号")
	private String higherunitid;
	/**
	 * 部门等级
	 */
	@ApiModelProperty("部门等级")
	private Integer unitlevel;
	/**
	 * 部门子集
	 */
	@ApiModelProperty("部门子集")
	private List<TreeUnitVO> children = new ArrayList<TreeUnitVO>();
	
	@ApiModelProperty("部门标志")
	private Integer bmbz;
	
	@ApiModelProperty("2级单位id")
	private String twodwid;

	public String getUnitid() {
		return unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getDwqc() {
		return dwqc;
	}

	public void setDwqc(String dwqc) {
		this.dwqc = dwqc;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

	public String getHigherunitid() {
		return higherunitid;
	}

	public void setHigherunitid(String higherunitid) {
		this.higherunitid = higherunitid;
	}

	public Integer getUnitlevel() {
		return unitlevel;
	}

	public void setUnitlevel(Integer unitlevel) {
		this.unitlevel = unitlevel;
	}

	public List<TreeUnitVO> getChildren() {
		return children;
	}

	public void setChildren(List<TreeUnitVO> children) {
		this.children = children;
	}

	public Integer getBmbz() {
		return bmbz;
	}

	public void setBmbz(Integer bmbz) {
		this.bmbz = bmbz;
	}

	public String getTwodwid() {
		return twodwid;
	}

	public void setTwodwid(String twodwid) {
		this.twodwid = twodwid;
	}
}
