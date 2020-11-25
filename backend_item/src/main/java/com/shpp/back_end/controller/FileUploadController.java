package com.shpp.back_end.controller;

import com.shop.utils.Result;
import com.shpp.back_end.service.FileUploadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("/file")
public class FileUploadController {
    @Resource
    private FileUploadService fileUploadServiceImpl;
    /*
    * upload file
    * */
    @RequestMapping("/upload")
    public Result fileUpload(MultipartFile file){
        try {
           return fileUploadServiceImpl.fileUpload(file);
        }catch (Exception e ){
            e.printStackTrace();
        }
        return Result.build(500,"Upload image fail.");
    }
}
