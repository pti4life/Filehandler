package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FilelistController {

    @Autowired
    FileService fileService;

    private static String UPLOADED_FOLDER = "D:\\TMP\\";

    @RequestMapping("/filelist")
    public String showFilelist() {
        return "secured/filelist";
    }

    @RequestMapping("/save")
    public String savefile(@RequestParam("file") MultipartFile file,
                           RedirectAttributes redirectAttributes, HttpServletRequest request){
        String currentPrincipalName = SecurityContextHolder.getContext()
                .getAuthentication().getName();

        User user=(User) request.getSession().getAttribute("user");
        String directory=UPLOADED_FOLDER+user.getId()+"\\";
       // UPLOADED_FOLDER=UPLOADED_FOLDER+user.getId()+"\\";
        System.out.println("controller:"+user+" file:"+file.getOriginalFilename());
        if(!file.isEmpty()) {
            fileService.save(file, directory,user);
        }

        return "secured/filelist";
    }
}
