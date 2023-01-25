package com.ivankimanoos.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		
		// create a new student object
		Student theStudent = new Student();
		
		
		// add the object as a model attribute
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student studentssss,
			BindingResult bindingResult) {
		
		System.out.println("First name of the student: " +studentssss.getFirstName());
		System.out.println("Last name of the student: "+studentssss.getLastName());
		System.out.println("Binding Result: " +bindingResult);
		
		System.out.println("\n\n\n\n\n");
		
		if (bindingResult.hasErrors()){
			return "student-form";
		}
		else
			return "student-confirmation";
		
	}
	
	
	
	
	
	
	
	
	
}
