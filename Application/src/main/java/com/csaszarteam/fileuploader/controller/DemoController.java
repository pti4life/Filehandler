package com.csaszarteam.fileuploader.controller;


import com.csaszarteam.fileuploader.service.UserService;
import com.csaszarteam.fileuploader.service.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class DemoController {

	@Autowired
	UserService userservice;

	@RequestMapping("/")
	public String showHome(Model model) {
		ArrayList<Integer> lista=new ArrayList<>(Arrays.asList(1,2,3,4));
		model.addAttribute("set",lista);
		model.addAttribute("userDTO",new UserDTO());
		return "singup";
	}

	@PostMapping("read")
	public String show( @ModelAttribute UserDTO test){
		userservice.saveUser(test);
		System.out.println(test);
		return "singup";
	}
}
