package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.service.FileService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class FileMakeController {

    private static String UPLOADED_FOLDER = "D:\\TMP\\";

    private static Long fileId;

    private String type;

    @Autowired
    FileService fileService;

    @GetMapping("/fileMake")
    public String showMakePage(HttpServletRequest request  ){
        fileId=null;
        type=".txt";
        return "secured/upload";
    }

    @PostMapping("/fileMake")
    public String showModifyPage(HttpServletRequest request){
        String req=request.getParameter("modifyFile");
        UserDTO user=(UserDTO) request.getSession().getAttribute("user");
        type=req.substring(req.lastIndexOf("."));
        fileId=Long.parseLong(req.substring(0,req.indexOf("+")));
        String content= null;
        try {
            content = fileService.getContent(UPLOADED_FOLDER+user.getId()+"\\"+fileId+type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
        request.setAttribute("newFileName",req.substring(req.indexOf("+")+1,req.lastIndexOf(".")));
        request.setAttribute("newFileContent",content);
        return "secured/upload";
    }

    @PostMapping("/makeFile")
    public String makeFile(HttpServletRequest request, HttpServletResponse response){
        UserDTO user=(UserDTO) request.getSession().getAttribute("user");

        String folder=UPLOADED_FOLDER+user.getId()+"\\";
        String newFileName=request.getParameter("newFileName");
        String content=request.getParameter("newFileContent");

        try {
            fileService.makeFile(folder,newFileName+type,content,user,fileId);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:fileMake";
    }
}
