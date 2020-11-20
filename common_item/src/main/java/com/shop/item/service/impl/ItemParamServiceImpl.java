package com.shop.item.service.impl;

import com.shop.item.service.ItemParamService;
import com.shop.mapper.TbItemParamItemMapper;
import com.shop.mapper.TbItemParamMapper;
import com.shop.pojo.TbItemCat;
import com.shop.pojo.TbItemParam;
import com.shop.pojo.TbItemParamExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
* ItemParamService
* */
@Service
public class ItemParamServiceImpl implements ItemParamService {
    @Resource
    private TbItemParamMapper tbItemParamMapper;
    @Override
    public TbItemParam selectItemParamByItemCatId(Long itemCatId) {
        TbItemParamExample example = new TbItemParamExample();
        TbItemParamExample.Criteria criteria = example.createCriteria();
        criteria.andItemCatIdEqualTo(itemCatId);
        List<TbItemParam> list = tbItemParamMapper.selectByExampleWithBLOBs(example);
        if(list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }
}
