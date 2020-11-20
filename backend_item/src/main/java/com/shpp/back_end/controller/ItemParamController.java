package com.shpp.back_end.controller;

import com.shop.utils.Result;
import com.shpp.back_end.service.ItemParamService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/backend/itemParam")
public class ItemParamController {
    @Resource
    private ItemParamService itemParamServiceImpl;
    /*
    * 根据商品分类查询规格参数模板
    * */
    @RequestMapping("/selectItemParamByItemCatId/{itemCatId}")
    public Result selectItemParamByItemCatId(@PathVariable("itemCatId") Long itemCatId){

        try{
            return itemParamServiceImpl.selectItemParamByItemCatId(itemCatId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500,"error");
    }
}
