package com.hantotem.property.mapper.mp;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hantotem.property.domain.dto.UhfsbxxDTO;
import com.hantotem.property.domain.entity.GaSacwUhfsbxxb;
import com.hantotem.property.domain.vo.UhfsbxxSaveBatchVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Rondo Chan
 * @version 1.0.0
 * @description
 * @since 2021/4/15 17:25
 */
@Repository
public interface GaSacwUhfsbxxbMapper extends BaseMapper<GaSacwUhfsbxxb> {

    /**
     * 批量添加 uhf 设备信息
     * @param vos 批量 uhf 设备信息
     * @return 是否成功
     */
    int saveBatchUhf(List<UhfsbxxSaveBatchVO> vos);
    /**
     * 分页获取 uhf 设备信息
     * @param page 分页对象
     * @param ssdwdm 设备所属单位代码
     * @return 分页数据
     */
    Page<UhfsbxxDTO> getPageUhfs(@Param("page") Page<GaSacwUhfsbxxb> page, @Param("ssdwdm") String ssdwdm);
}
