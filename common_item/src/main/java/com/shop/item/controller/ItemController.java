package com.shop.item.controller;

import com.shop.item.service.ItemService;
import com.shop.utils.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/service/item")
public class ItemController {
    @Resource
    private ItemService itemServiceImpl;
    /*
    * 查询商品数据
    * */
    @RequestMapping("/selectTbItemAllByPage")
    public PageResult selectTbItemAllByPage(@RequestParam Integer page, @RequestParam Integer  rows){
        return itemServiceImpl.selectTbItemAllByPage(page,rows);
    }
}
