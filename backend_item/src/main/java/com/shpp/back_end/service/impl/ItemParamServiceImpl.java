package com.shpp.back_end.service.impl;

import com.shop.pojo.TbItemParam;
import com.shop.utils.Result;
import com.shpp.back_end.feign.CommonItemFeignClient;
import com.shpp.back_end.service.ItemParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemParamServiceImpl implements ItemParamService {
    @Resource
    private CommonItemFeignClient commonItemFeignClient;
    @Override
    public Result selectItemParamByItemCatId(Long itemCatId) {
        TbItemParam tbItemParam = commonItemFeignClient.selectItemParamByItemCatId(itemCatId);
        if(tbItemParam != null){
            return Result.ok(tbItemParam);
        }
        return Result.error("查无结果");
    }
}
