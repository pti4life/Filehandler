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
public class AuthenticationController {

	@Autowired
	UserService userservice;

	@GetMapping("/signup")
	public String showSignupPage(Model model) {
		model.addAttribute("userDTO",new UserDTO());
		return "public/singup";
	}

	@GetMapping("/login")
	public String showLoginPage(Model model) {
		model.addAttribute("userDTO",new UserDTO());
		return "public/login";
	}

	@PostMapping("/signup")
	public String doSignup(@ModelAttribute UserDTO test){
		userservice.saveUser(test);
		System.out.println(test);
		return "public/singup";
	}


}
