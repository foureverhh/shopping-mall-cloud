package com.shpp.back_end.controller;

import com.shop.utils.Result;
import com.shpp.back_end.service.ItemCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/backend/itemCategory")
public class ItemCategoryController {

    @Resource
    private ItemCategoryService itemCategoryServiceImpl;

    /*
    *根据类目ID查询商品子节点
    * */
    @RequestMapping("/selectItemCategoryByParentId")
    public Result selectItemCategoryByParentId(@RequestParam(name = "id",defaultValue = "0" ) Long id){
        try{
            return itemCategoryServiceImpl.selectItemCategoryByParentId(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500,"Error");
    }
}
