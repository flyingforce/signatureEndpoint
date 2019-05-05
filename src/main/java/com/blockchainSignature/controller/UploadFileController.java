package com.blockchainSignature.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping(value = {"/api/v1/file"})
public class UploadFileController {


    @PostMapping
    public String uploadFile (@RequestParam("file") MultipartFile file) {
        StringBuilder strB = new StringBuilder();
        strB.append(file.getOriginalFilename()).append(":").append(file.getName()).append(":").append(file.getContentType());
        return strB.toString();
    }

}
