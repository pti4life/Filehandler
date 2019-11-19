package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {

    @RequestMapping("/")
    public String showSignupPage(Model model) {
        return "public/home";
    }
}
