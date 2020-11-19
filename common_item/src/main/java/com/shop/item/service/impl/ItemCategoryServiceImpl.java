package com.shop.item.service.impl;

import com.shop.item.service.ItemCategoryService;
import com.shop.mapper.TbItemCatMapper;
import com.shop.pojo.TbItemCat;
import com.shop.pojo.TbItemCatExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {
    @Resource
    private TbItemCatMapper tbItemCatMapper;
    @Override
    public List<TbItemCat> selectItemCategoryByParentId(Long id) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(id);
        criteria.andStatusEqualTo(1);
        return tbItemCatMapper.selectByExample(example);
    }
}
