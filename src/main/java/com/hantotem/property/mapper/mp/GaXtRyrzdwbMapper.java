package com.hantotem.property.mapper.mp;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hantotem.property.domain.entity.GaXtGlbmb;
import com.hantotem.property.domain.entity.GaXtRyrzdwb;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 民警任职单位表(GaXtRyrzdwb)表数据库访问层
 *
 * @author zhangbo
 * @since 2021-07-02 11:14:05
 */
@Repository
public interface GaXtRyrzdwbMapper extends BaseMapper<GaXtRyrzdwb> {

    /**
     * 根据警号查询民警信息
     * @param jh
     * @return
     */
    GaXtRyrzdwb selectPoliceInfoByJh(@Param("jh") String jh);

    /**
     * 查询单位信息
     * @param jumpUnitId
     * @return
     */
    GaXtGlbmb selectDwxx(@Param("unitId") String jumpUnitId);
}
