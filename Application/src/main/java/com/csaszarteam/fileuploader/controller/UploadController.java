package com.csaszarteam.fileuploader.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class UploadController {
    private static String UPLOADED_FOLDER = "D:\\TMP\\";


    @GetMapping("upload")
    public String showUploadPage(Model model){
        return "upload";
    }

    @PostMapping("save")
    public String savefile(@RequestParam("file") MultipartFile file,
                           RedirectAttributes redirectAttributes){
        System.out.println(file.getOriginalFilename());
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        UPLOADED_FOLDER=UPLOADED_FOLDER+currentPrincipalName+"\\";

        try {
            byte[] bytes = file.getBytes();
            Files.createDirectories(Paths.get(UPLOADED_FOLDER));
            Path path = Paths.get(UPLOADED_FOLDER+"sanyi"+ FilenameUtils.getExtension(file.getOriginalFilename()));
            System.out.println(path);
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
            return "upload";
    }
}
