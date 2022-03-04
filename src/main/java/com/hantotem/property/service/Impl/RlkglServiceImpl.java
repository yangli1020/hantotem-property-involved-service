package com.hantotem.property.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hantotem.property.domain.entity.GaSacwYhgl;
import com.hantotem.property.domain.vo.AddPhotoVO;
import com.hantotem.property.domain.vo.SearchVO;
import com.hantotem.property.domain.vo.UserUpdateVO;
import com.hantotem.property.mapper.mp.GaSacwYhglMapper;
import com.hantotem.property.service.RlkglService;
import javafx.scene.effect.Light;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional
public class RlkglServiceImpl extends ServiceImpl<GaSacwYhglMapper,GaSacwYhgl> implements RlkglService {

    private final GaSacwYhglMapper gaSacwYhglMapper;



    /*@Override
    public GaSacwYhgl findBysfzhAndjybh(SearchVO searchVO) {
        QueryWrapper<GaSacwYhgl> wrapper = new QueryWrapper<>();
        String sfzh = searchVO.getSfzh();
        String jh = searchVO.getJh();
        if (searchVO!=null){
            if (StringUtils.isEmpty(jh)){
                wrapper.eq("sfzh",sfzh);
                GaSacwYhgl gaSacwYhgl = gaSacwYhglMapper.selectOne(wrapper);
                return gaSacwYhgl;
            }else if (StringUtils.isEmpty(sfzh)){
                wrapper.eq("jh",jh);
                GaSacwYhgl gaSacwYhgl = gaSacwYhglMapper.selectOne(wrapper);
                return gaSacwYhgl;
            }

        }
        return null;

    }*/

    @Override
    public List<GaSacwYhgl> findBysfzhAndjybh(String no) {
        QueryWrapper<GaSacwYhgl> wrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(no)){
            wrapper.like("sfzh",no)
                    .or().like("jh",no);
        }
        List<GaSacwYhgl> gaSacwYhgls = gaSacwYhglMapper.selectList(wrapper);
        return gaSacwYhgls;


    }

    @Override
    public Boolean deleteRyByjybh(Long id) {
        //设置人脸数据为空
        UpdateWrapper<GaSacwYhgl> wrapper = new UpdateWrapper<>();
        if (id !=null){
            wrapper.lambda()
                    .set(GaSacwYhgl::getRlzp,null)
                    .set(GaSacwYhgl::getUpdatedTime,new Date())
                    .eq(GaSacwYhgl::getId,id);
        }

        return gaSacwYhglMapper.update(null,wrapper)>0 ? true:false;
    }


    @Override
    public boolean updateByJh(UserUpdateVO vo) {
        GaSacwYhgl gaSacwYhgl = new GaSacwYhgl();
        QueryWrapper<GaSacwYhgl> wrapper = new QueryWrapper<>();
        wrapper.eq("jh",vo.getJh());
        GaSacwYhgl yhgl = gaSacwYhglMapper.selectOne(wrapper);
        return false;
    }

    @Override
    public void savePhoto( Long id, String url) {

        GaSacwYhgl yhgl = gaSacwYhglMapper.selectById(id);
        yhgl.setRlzp(url);
        gaSacwYhglMapper.updateById(yhgl);

    }
}
