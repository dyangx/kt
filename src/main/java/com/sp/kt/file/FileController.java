package com.sp.kt.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("/file")
public class FileController {

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadFile(MultipartFile[] files,String name){
        if(files != null && files.length > 0){

        }
        return "success";
    }
}
