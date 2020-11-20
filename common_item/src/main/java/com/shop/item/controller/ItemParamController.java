package com.shop.item.controller;

import com.shop.item.service.ItemParamService;
import com.shop.pojo.TbItemParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/service/itemParam")
public class ItemParamController {
    @Resource
    private ItemParamService itemParamServiceImpl;
    /*
    * 根据商品分类ID查询规格参数模板
    * */
    @RequestMapping("/selectItemParamByItemCatId")
    public TbItemParam selectItemParamByItemCatId(@RequestParam Long itemCatId){
        return  itemParamServiceImpl.selectItemParamByItemCatId(itemCatId);
    }
}
