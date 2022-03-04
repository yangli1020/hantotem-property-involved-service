package com.hantotem.property.mapper.mp;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hantotem.property.domain.dto.CaseInfoTO;
import com.hantotem.property.domain.entity.GaSacwAjxxb;
import com.hantotem.property.domain.vo.AjQueryVO;
import com.hantotem.property.domain.vo.AjSaveVO;
import com.hantotem.property.domain.vo.AjxxQueryVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 案件信息表(GaSacwAjxxb)表数据库访问层
 *
 * @author geekerstar
 * @since 2021-03-22 17:19:37
 */
@Repository
public interface GaSacwAjxxbMapper extends BaseMapper<GaSacwAjxxb> {

    /**
     * 分页获取案件信息
     * @param page 分页对象
     * @param vo   案件信息查询 VO
     * @return 案件信息
     */
    IPage<AjSaveVO> getPageQueriedAjxxs(Page<GaSacwAjxxb> page, @Param("vo") AjQueryVO vo);

    /**
     * 查询最新的案件信息
     * @param page
     * @param ssdwdm
     * @param query
     * @return
     */
    IPage<AjxxQueryVO> queryByCondition(IPage<AjxxQueryVO> page, String ssdwdm, String query);

    List<GaSacwAjxxb> queryCaseInfo(@Param("dto") CaseInfoTO dto);

    void updateCase();
}
