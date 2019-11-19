package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {

    @Autowired
    UserService userservice;

    @GetMapping("/profile")
    public String showProfilePage(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "secured/profile";
    }

    @PostMapping("/profile/email")
    public String updateEmail(@ModelAttribute UserDTO test, Model model) {
        System.out.println(test.getEmail());
        return "secured/profile";
    }

    @PostMapping("/profile/username")
    public String updateUserName(@ModelAttribute UserDTO test, Model model) {
        System.out.println(test.getUsername());
        return "secured/profile";
    }

    @PostMapping("/profile/password")
    public String updatePassword(@ModelAttribute UserDTO test, Model model) {
        System.out.println(test.getPassword());
        return "secured/profile";
    }

}
