package com.shpp.back_end.service.impl;

import com.shop.utils.FtpUtil;
import com.shop.utils.IDUtils;
import com.shop.utils.Result;
import com.shpp.back_end.service.FileUploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* upload picture service
* */
@Service
public class FileUploadServiceImpl implements FileUploadService {
    @Override
    public Result fileUpload(MultipartFile file) {
        try {
        //定义上传图片的目录结构
        SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
        String path = sdf.format(new Date());
        //设置新的文件名
        String newFileName = IDUtils.genImageName() +
                file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            System.out.println("path: " + path + ", newFileName: " + newFileName);
           FtpUtil.uploadFile("192.168.10.120", 21,
                    "ftpuser", "ftpuser",
                    "/home/ftpuser/ftp", path, newFileName, file.getInputStream());
            String imageURL = "http://192.168.10.120"+ path + newFileName;
            return Result.ok(imageURL);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return Result.build(500,"Image upload failure");
    }
}
