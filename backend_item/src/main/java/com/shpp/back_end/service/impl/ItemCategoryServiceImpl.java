package com.shpp.back_end.service.impl;

import com.shop.pojo.TbItemCat;
import com.shop.utils.Result;
import com.shpp.back_end.feign.CommonItemFeignClient;
import com.shpp.back_end.service.ItemCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
* 商品类
* */
@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {
    @Resource
    private CommonItemFeignClient commonItemFeignClient;

    @Override
    public Result selectItemCategoryByParentId(Long id) {
        List<TbItemCat> list = commonItemFeignClient.selectItemCategoryByParentId(id);
        if(list != null && list.size() >0 ){
            return Result.ok(list);
        }
        return Result.error("No result");
    }
}
