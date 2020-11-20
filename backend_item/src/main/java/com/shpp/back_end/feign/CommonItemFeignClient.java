package com.shpp.back_end.feign;

import com.shop.pojo.TbItemCat;
import com.shop.pojo.TbItemParam;
import com.shop.utils.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "common-item")
public interface CommonItemFeignClient {
    //...../service/item
    @GetMapping("/service/item/selectTbItemAllByPage")
    PageResult selectTbItemAllByPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer  rows);

    //...../service/itemCategory
    @GetMapping("/service/itemCategory/selectItemCategoryByParentId")
    List<TbItemCat> selectItemCategoryByParentId(@RequestParam(name="id") Long id);

    //...../service/itemParam
    @GetMapping("/service/itemParam/selectItemParamByItemCatId")
    TbItemParam selectItemParamByItemCatId(@RequestParam Long itemCatId);
}
