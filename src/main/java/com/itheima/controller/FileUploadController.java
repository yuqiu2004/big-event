package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.utils.AliOssUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Controller
@ResponseBody
public class FileUploadController {

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws Exception {
        //文件存储
        String filename = file.getOriginalFilename();
        //保证文件名唯一 以防覆盖
        String newName = UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf('.'));
//        file.transferTo(new File("C:\\Users\\SN\\Desktop\\files\\"+newName));
        String url = AliOssUtil.uploadFile(newName,file.getInputStream());
        return Result.success(url);
    }
}
