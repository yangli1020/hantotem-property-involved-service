package com.hantotem.property.mapper.mp;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hantotem.property.domain.entity.GaSacwYhgl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户管理(GaSacwYhgl)表数据库访问层
 *
 * @author geekerstar
 * @since 2021-03-22 17:19:40
 */
@Repository
public interface GaSacwYhglMapper extends BaseMapper<GaSacwYhgl> {

    List<GaSacwYhgl> queryYhByCondition(String condition);
}
