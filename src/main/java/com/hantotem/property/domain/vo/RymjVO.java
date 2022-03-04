package com.hantotem.property.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>Title:RymjVO </p>
 * <p>Description: 单位下对应的人员VO</p>
 * @author quwuqing
 * @date 2019年10月28日下午2:49:22
 */
@Data
@ApiModel("单位下对应的人员VO")
public class RymjVO {
	
	@ApiModelProperty("民警编号")
	private String mjbh;
	
	@ApiModelProperty("姓名")
	private String xm;
	
	@ApiModelProperty("警号")
	private String jh;
	
	@ApiModelProperty("名称")
	private String mc;
	
	@ApiModelProperty("单位代码")
	private String dm;

	@ApiModelProperty("手机号码")
	private String lxfs;
	
	@ApiModelProperty("职务")
	private String zw;
	
	@ApiModelProperty("认知机构名称")
	private String rzjgmc;
	
	@ApiModelProperty("姓名简拼")
	private String jp;

}
