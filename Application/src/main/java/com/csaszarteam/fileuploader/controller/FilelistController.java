package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.database.entity.File;
import com.csaszarteam.fileuploader.database.entity.User;
import com.csaszarteam.fileuploader.database.repository.FileDAO;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import com.csaszarteam.fileuploader.service.FileService;
import com.csaszarteam.fileuploader.service.domain.FileDTO;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Slf4j
public class FilelistController {

    @Autowired
    FileDAO fileDAO;

    @Autowired
    FileService fileService;

    @Autowired
    ModelMapper modelMapper;

    private static String UPLOADED_FOLDER = "D:\\TMP\\";

    private List files;

    @RequestMapping("/filelist")
    public String showFilelist(HttpServletRequest request, Model model) {
        UserDTO userDTO=(UserDTO) request.getSession().getAttribute("user");
        if(!model.containsAttribute("files")){
            files=fileService.getAllFiles(userDTO);
        }
        model.addAttribute("files",files);
        return "secured/filelist";
    }

    @RequestMapping("/save")
    public String savefile(@RequestParam("file") MultipartFile file,
                           RedirectAttributes redirectAttributes, HttpServletRequest request){

        UserDTO user=(UserDTO) request.getSession().getAttribute("user");
        String directory=UPLOADED_FOLDER+user.getId()+"\\";

        System.out.println("controller:"+user+" file:"+file.getOriginalFilename());
        if(!file.isEmpty()) {
            fileService.save(file, directory,user);
            files=fileService.getAllFiles(user);
        }

        return "redirect:/filelist";
    }

    @RequestMapping
    public String downloadFile(@ModelAttribute FileDTO file, HttpServletRequest req, HttpServletResponse resp) {
        UserDTO user=(UserDTO)req.getSession().getAttribute("user");
        //file=FileDTO.builder().fileName()
        fileService.downloadFile(file,user,resp);
        return "redirect:/filelist";
    }
}
