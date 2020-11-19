package com.shop.item.controller;

import com.shop.item.service.ItemCategoryService;
import com.shop.pojo.TbItemCat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/service/itemCategory")
public class ItemCategoryController {
    @Resource
    private ItemCategoryService itemCategoryServiceImpl;

    /*
    * 根据父节点查询子节点
    * */
    @RequestMapping("/selectItemCategoryByParentId")
    public List<TbItemCat> selectItemCategoryByParentId(@RequestParam Long id){
        return itemCategoryServiceImpl.selectItemCategoryByParentId(id);
    }
}
