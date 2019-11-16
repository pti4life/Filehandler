package com.csaszarteam.fileuploader.controller;

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
