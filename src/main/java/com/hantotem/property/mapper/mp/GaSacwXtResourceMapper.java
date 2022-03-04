package com.hantotem.property.mapper.mp;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hantotem.property.domain.entity.GaSacwXtResource;
import com.hantotem.property.domain.vo.PermissionResourceVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 系统资源配置表(GaSacwXtResource)表数据库访问层
 *
 * @author zhangbo
 * @since 2021-07-08 16:27:47
 */
@Repository
public interface GaSacwXtResourceMapper extends BaseMapper<GaSacwXtResource> {

    /**
     * 获取涉案财物中心所有资源
     * @return 权限资源
     */
    List<PermissionResourceVO> getPermissionResourceList();

}
