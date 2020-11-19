package com.shop.item.service;

import com.shop.utils.PageResult;

public interface ItemService {
    PageResult selectTbItemAllByPage(Integer page,Integer rows);
}
