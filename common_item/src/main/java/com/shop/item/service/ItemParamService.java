package com.shop.item.service;


import com.shop.pojo.TbItemParam;

public interface ItemParamService {
    TbItemParam selectItemParamByItemCatId(Long itemCatId);
}
