package com.shpp.back_end.service;

import com.shop.utils.Result;

public interface ItemCategoryService {
    Result selectItemCategoryByParentId(Long id);
}
