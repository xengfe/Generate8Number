package com.yskj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeConroller {
	
	@RequestMapping(value = "", method = { RequestMethod.GET })
	public String toHome() {
		return "home";
	}

}
