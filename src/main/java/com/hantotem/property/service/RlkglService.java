package com.hantotem.property.service;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hantotem.property.domain.entity.GaSacwYhgl;
import com.hantotem.property.domain.vo.AddPhotoVO;
import com.hantotem.property.domain.vo.SearchVO;
import com.hantotem.property.domain.vo.UserUpdateVO;

import java.util.List;
import java.util.Map;

public interface RlkglService extends IService<GaSacwYhgl> {

    //根据身份证号来进行查询人员信息
    public List<GaSacwYhgl> findBysfzhAndjybh(String no);
    //根据警员编号来删除人员信息
    public Boolean deleteRyByjybh(Long id);
    /*boolean addRyxx(AddPhotoVO vo);*/
    //根据警号来修改信息
    public boolean updateByJh(UserUpdateVO vo);

    void savePhoto(Long id,String url);
}
