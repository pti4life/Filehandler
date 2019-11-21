package com.csaszarteam.fileuploader.controller;

import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String updateEmail(@ModelAttribute UserDTO test, HttpServletRequest req) {
        UserDTO userDTO = (UserDTO) req.getSession().getAttribute("user");
        String currentHashedPass = userDTO.getPassword();

        String givenPass = test.getPassword();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean correctPass = passwordEncoder.matches(givenPass, currentHashedPass);

        if(correctPass) {
            userDTO.setEmail(test.getEmail());
            userservice.updateEmail(userDTO);
        }

        return "secured/profile";
    }

    @PostMapping("/profile/username")
    public String updateUserName(@ModelAttribute UserDTO test, HttpServletRequest req) {
        UserDTO userDTO = (UserDTO) req.getSession().getAttribute("user");
        String currentHashedPass = userDTO.getPassword();

        String givenPass = test.getPassword2();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean correctPass = passwordEncoder.matches(givenPass, currentHashedPass);

        if(correctPass) {
            userDTO.setUsername(test.getUsername());
            userservice.updateUserName(userDTO);
        }

        return "secured/profile";
    }

    @PostMapping("/profile/password")
    public String updatePassword(@ModelAttribute UserDTO test, HttpServletRequest req) {
        UserDTO userDTO = (UserDTO) req.getSession().getAttribute("user");
        String currentHashedPass = userDTO.getPassword();

        String givenPass = test.getPassword3();
        String newPass = test.getPassword4();

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean correctPass = passwordEncoder.matches(givenPass, currentHashedPass);

        if(correctPass) {
            userDTO.setPassword(test.getPassword4());
            userservice.updatePassword(userDTO);
        }

        return "secured/profile";
    }
}
