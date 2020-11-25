package com.shpp.back_end.service;

import com.shop.utils.Result;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    Result fileUpload(MultipartFile file);
}
