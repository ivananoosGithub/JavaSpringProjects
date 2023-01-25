package com.ivankimanoos.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/main-menu")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		//return the template like in django return redirect("helloworld-form.html")
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// @RequestParam("studentName") String personName in the parameters
		
		String personName = request.getParameter("studentName");
		
		personName = personName.toUpperCase();
		
		String result = "YO!! WTF?" +personName;
		
		
		model.addAttribute("badMessage", result);
		
		return "helloworld";
	}

}
