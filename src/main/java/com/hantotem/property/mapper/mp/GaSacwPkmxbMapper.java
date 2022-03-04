package com.hantotem.property.mapper.mp;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hantotem.property.domain.dto.UpdateAjxxCascadeDTO;
import com.hantotem.property.domain.entity.GaSacwPkmxb;
import org.springframework.stereotype.Repository;

/**
 * 盘库明细表(GaSacwPkmxb)表数据库访问层
 *
 * @author geekerstar
 * @since 2021-03-22 17:19:40
 */
@Repository
public interface GaSacwPkmxbMapper extends BaseMapper<GaSacwPkmxb> {

    /**
     * 级联更新与案件相关的盘库信息
     *
     * @param dto {@link UpdateAjxxCascadeDTO}
     */
    void updateByAjbhCascade(UpdateAjxxCascadeDTO dto);
}
