package com.shpp.back_end.service;

import com.shop.utils.Result;

public interface ItemService {
    Result selectTbItemAllByPage(Integer page, Integer rows);
}
