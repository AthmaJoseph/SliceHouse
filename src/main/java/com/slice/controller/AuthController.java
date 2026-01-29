package com.slice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.slice.model.User;

@Controller
public class AuthController {

//	@Autowired
//	private UserService userservice;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/register")
	public String showRegister(Model model) {
	model.addAttribute("user",new User());
	return "register";
	}
}
