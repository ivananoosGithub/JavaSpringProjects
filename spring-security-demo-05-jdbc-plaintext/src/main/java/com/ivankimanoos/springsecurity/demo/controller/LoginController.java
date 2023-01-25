package com.ivankimanoos.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		
		
//		return "plain-login";		
		return "fancy-login";
	}
	
	@GetMapping("/user-access-denied")
	public String userAccessDenied() {

		return "error-page";

	}
}


