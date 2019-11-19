package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
    @Autowired
    UserService userService;
    @RequestMapping("/")
    public String showSignupPage(Model model) {

        userService.saveUser(UserDTO.builder().id(76L).name("istvan").email("istvan@istvan.com").password("istvan")
                            .build());
        return "public/home";
    }
}
