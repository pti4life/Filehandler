package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.service.FileService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class UploadController {

    @Autowired
    FileService fileService;

    private static String UPLOADED_FOLDER = "D:\\TMP\\";

    @RequestMapping("/upload")
    public String showUploadPage(Model model){
        return "secured/upload";
    }

    @RequestMapping("save")
    public String savefile(@RequestParam("file") MultipartFile file,
                           RedirectAttributes redirectAttributes, HttpServletRequest request){
        String currentPrincipalName = SecurityContextHolder.getContext()
                                      .getAuthentication().getName();

        User user=(User) request.getSession().getAttribute("user");
        UPLOADED_FOLDER=UPLOADED_FOLDER+user.getId()+"\\";
        if(!file.isEmpty()) {
            fileService.save(file, UPLOADED_FOLDER,user);
        }

        return "secured/upload";
    }
}
