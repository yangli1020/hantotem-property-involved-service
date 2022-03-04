package com.hantotem.property.mapper.mp;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hantotem.property.domain.dto.TodayStatisticDTO;
import com.hantotem.property.domain.dto.UpdateAjxxCascadeDTO;
import com.hantotem.property.domain.entity.GaSacwCrkjlb;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 出入库记录表(GaSacwCrkjlb)表数据库访问层
 *
 * @author geekerstar
 * @since 2021-03-22 17:19:38
 */
@Repository
public interface GaSacwCrkjlbMapper extends BaseMapper<GaSacwCrkjlb> {

    /**
     * 级联更新与案件相关的盘库信息
     *
     * @param dto {@link UpdateAjxxCascadeDTO}
     */
    void updateByAjbhCascade(UpdateAjxxCascadeDTO dto);

    /**
     * 查询出入库记录，根据最新入库时间降序查询第 1 条记录
     * @param wprfid 物品标签 id
     * @param wpztdldm 物品状态大类代码 在库|出库
     * @param ssdwdm 设备所属单位代码
     * @return 出入库记录
     */
    GaSacwCrkjlb getNewestInRecord(@Param("wprfid") String wprfid, @Param("ssdwdm") String ssdwdm, @Param("wpztdldm") String wpztdldm);

    /**
     * 获取时间段内出入库数量
     * @param ssdwdm 所属单位代码
     * @param startTime 起始时间
     * @param endTime 结束时间
     * @return 统计数量
     */
    TodayStatisticDTO getStatisticByTime(@Param("ssdwdm") String ssdwdm, @Param("startTime") String startTime, @Param("endTime") String endTime);
}
