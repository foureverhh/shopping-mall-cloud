package com.shop.item.service;

import com.shop.pojo.TbItemCat;

import java.util.List;

public interface ItemCategoryService {
    List<TbItemCat> selectItemCategoryByParentId(Long id);
 }
