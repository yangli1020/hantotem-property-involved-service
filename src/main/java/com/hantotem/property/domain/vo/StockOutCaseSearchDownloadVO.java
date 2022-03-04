package com.hantotem.property.domain.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Description TODO
 * @ClassName StockOutCaseSearchDownloadVO
 * @Author luxiang
 * @Date 2021-09-16
 * @Version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "StockOutCaseSearchDownloadVO", description = "出库案件检索列表下载")
public class StockOutCaseSearchDownloadVO {

    @ApiModelProperty(value = "序号")
    @ExcelProperty(value = "序号",index = 0)
    @ColumnWidth(15)
    private Integer xh;

    @ApiModelProperty("案件编号")
    @ExcelProperty(value = "案件编号",index = 1)
    @ColumnWidth(15)
    private String ajbh;

    @ApiModelProperty("案件名称")
    @ExcelProperty(value = "案件名称",index = 2)
    @ColumnWidth(15)
    private String ajmc;

    @ApiModelProperty("案件类型")
    @ExcelProperty(value = "案件类型",index = 3)
    @ColumnWidth(15)
    private String ajlx;

    @ApiModelProperty("案件类别")
    @ExcelProperty(value = "案件类别",index = 4)
    @ColumnWidth(15)
    private String ajlb;

    @ApiModelProperty("案件主办单位")
    @ExcelProperty(value = "主办单位",index = 5)
    @ColumnWidth(15)
    private String ajzbdw;

    @ApiModelProperty("办案人")
    @ExcelProperty(value = "办案人",index = 6)
    @ColumnWidth(15)
    private String bar;

    @ApiModelProperty("涉案物品")
    @ExcelProperty(value = "涉案物品",index = 7)
    @ColumnWidth(15)
    private String sawp;

    @ApiModelProperty("物品描述")
    @ExcelProperty(value = "物品描述",index = 8)
    @ColumnWidth(15)
    private String wpms;

    @ApiModelProperty("存放位置")
    @ExcelProperty(value = "存放位置",index = 9)
    @ColumnWidth(15)
    private String cfwz;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ExcelProperty(value = "更新时间",index = 10)
    @ColumnWidth(15)
    private String updatetime;

    /**
     * 修改时间转换
     */
    public void fomatXgsj(LocalDateTime gxsj){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        if (null != gxsj){
            Date.from(gxsj.atZone(ZoneId.systemDefault()).toInstant());
            this.updatetime = sdf.format(Date.from(gxsj.atZone(ZoneId.systemDefault()).toInstant()));
        }
    }

}
