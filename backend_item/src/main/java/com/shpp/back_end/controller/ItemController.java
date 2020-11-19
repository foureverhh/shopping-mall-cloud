package com.shpp.back_end.controller;

import com.shop.utils.Result;
import com.shpp.back_end.service.ItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/backend/item")
public class ItemController {
    @Resource
    private ItemService itemServiceImpl;

    @RequestMapping("/selectTbItemAllByPage")
    public Result selectTbItemAllByPage(@RequestParam (defaultValue = "1") Integer page,
                                        @RequestParam(defaultValue = "2") Integer rows){

        try{
            return itemServiceImpl.selectTbItemAllByPage(page,rows);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500,"error");
    }

}
