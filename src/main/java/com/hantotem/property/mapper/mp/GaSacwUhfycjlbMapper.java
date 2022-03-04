package com.hantotem.property.mapper.mp;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hantotem.property.domain.entity.GaSacwUhfycjlb;
import org.springframework.stereotype.Repository;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description 
 * @since 2021/4/15 17:25
 */
@Repository
public interface GaSacwUhfycjlbMapper extends BaseMapper<GaSacwUhfycjlb> {
    /**
     * 根据物品标签id查询最新的一条异常数据
     * @param wprfid
     * @return
     */
    GaSacwUhfycjlb selectOneJlxx(String wprfid);
}
