package com.hantotem.property.service.Impl;

import cn.hutool.system.SystemUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.hantotem.property.domain.dto.CaseInfoDTO;
import com.hantotem.property.domain.dto.ItemSaveDTO;
import com.hantotem.property.domain.entity.GaSacwAjxxb;
import com.hantotem.property.mapper.mp.GaSacwAjxxbMapper;
import com.hantotem.property.service.StockService;
import com.hantotem.property.util.SystemIdUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final GaSacwAjxxbMapper gaSacwAjxxbMapper;

    @Override
    public String caseRelate(String idStr, CaseInfoDTO caseInfoDTO) {
       LocalDateTime now = LocalDateTime.now();
        QueryWrapper<GaSacwAjxxb> wrapper = new QueryWrapper<>();
        //多条件查询
        wrapper.lambda().eq(GaSacwAjxxb::getAjbh,caseInfoDTO.getAjbh());
        GaSacwAjxxb ajxxb= gaSacwAjxxbMapper.selectOne(wrapper);
        GaSacwAjxxb  gaSacwAjxxb = new GaSacwAjxxb();
        String czbh = SystemIdUtil.getCzbh();
        /*判断查询的结果是否为空,分为三种情况：
        1.如果查询结果为空，就新添加案件，返回操作编号
        2.如果查询结果不为空。已存在案件，案件关联，上次操作未完成，返回上次操作编号
        3.如果查询结果不为空。已存在案件，案件关联，没有未完成的操作，返回新操作编号
        */
        if(gaSacwAjxxb ==null){
            log.info("[{}]案件关联，新添加案件，返回操作编号：{}，入参:{}", idStr, czbh, caseInfoDTO);
            BeanUtils.copyProperties(caseInfoDTO,gaSacwAjxxb);
            gaSacwAjxxb.setCreatedBy(caseInfoDTO.getDlr());
            gaSacwAjxxb.setCreatedCode(caseInfoDTO.getDlrmjbh());
            gaSacwAjxxb.setCzbh(czbh);
            gaSacwAjxxb.setCzsj(now);
            gaSacwAjxxb.setRksj(now);
            gaSacwAjxxbMapper.insert(gaSacwAjxxb);
        }else if (StringUtils.isNotBlank(ajxxb.getCzbh())){
            czbh=ajxxb.getCzbh();
            log.info("[{}]案件关联，已存在案件，上次操作未完成，返回上次操作编号：{}", idStr, czbh);
            gaSacwAjxxbMapper.update(null,new LambdaUpdateWrapper<GaSacwAjxxb>()
            .set(GaSacwAjxxb::getCzsj,now)
            .eq(GaSacwAjxxb::getAjbh,caseInfoDTO.getAjbh()));
        }else {
            log.info("[{}]案件关联，已存在案件，无未完成操作，返回新操作编号：{}", idStr, czbh);
            gaSacwAjxxbMapper.update(null,
                    new LambdaUpdateWrapper<GaSacwAjxxb>()
            .set(GaSacwAjxxb::getCzbh,czbh)
            .set(GaSacwAjxxb::getCzsj,now)
            .eq(GaSacwAjxxb::getAjbh,caseInfoDTO.getAjbh()));
        }
        return czbh;
    }

    @Override
    public void saveItem(String idStr, ItemSaveDTO itemSaveDTO) {
        LocalDateTime now = LocalDateTime.now();
        //获取物品编号，根据物品编号来判断来判断是否存在该物品
        String existwpbh = itemSaveDTO.getWpbh();
        if (StringUtils.isNotBlank(existwpbh)){
            log.info("[{}]物品登记，新增物品，传入的参数：{}",idStr,itemSaveDTO);
            //插入物品信息表
            GaSacwAjxxb gaSacwAjxxb = new GaSacwAjxxb();
            BeanUtils.copyProperties(itemSaveDTO,gaSacwAjxxb);
            String wpbh = SystemIdUtil.getWpbh();


        }


    }
}
