package com.yskj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/login")
public class LoginController {
	
	
	@RequestMapping(value = "",method = {RequestMethod.POST})
	public String login(
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password){
		String page = null;
		
		if (username .equals("administrator") || password.equals("123456")) {
			page = "redirect:/home";
		}else {
			page = "error.jsp";
		}
		return page;
	}
	
	
}
