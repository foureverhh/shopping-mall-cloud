package com.shpp.back_end.service.impl;

import com.shop.utils.PageResult;
import com.shop.utils.Result;
import com.shpp.back_end.feign.CommonItemFeignClient;
import com.shpp.back_end.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/*
* 与前端网页连接
* */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private CommonItemFeignClient commonItemFeignClient;
    @Override
    public Result selectTbItemAllByPage(Integer page, Integer rows) {
        PageResult pageResult = commonItemFeignClient.selectTbItemAllByPage(page,rows);
        if(pageResult != null && pageResult.getResult() != null && pageResult.getResult().size() > 0){
            return Result.ok(pageResult);
        }
        return Result.error("查无结果！");
    }
}
