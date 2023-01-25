package com.ivankimanoos.springboot.demo.myfirstspringbootapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHelloWorld() {
		return "Hello World! Time on server is: " +LocalDateTime.now();
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/workout")	
	public String getDailyWorkout() {
		
		return "Run a hard 5km!";
	}
}


