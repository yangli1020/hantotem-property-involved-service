package com.hantotem.property.mapper.mp;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hantotem.property.domain.entity.GaSacwCwgb;
import com.hantotem.property.domain.vo.PhotoAndCabinetIpVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 储物柜表(GaSacwCwgb)表数据库访问层
 *
 * @author geekerstar
 * @since 2021-03-22 17:19:39
 */
@Repository
public interface GaSacwCwgbMapper extends BaseMapper<GaSacwCwgb> {
    /**
     * 查询单位下的柜体ip
     * @param ssdwdm
     * @param page
     * @return
     */
    IPage<PhotoAndCabinetIpVO> queryCabinetIpByUrl(String ssdwdm, IPage<PhotoAndCabinetIpVO> page);

    Integer selectSkbh(String jtwz);

    List<GaSacwCwgb> selectGz(Integer integer);
}
