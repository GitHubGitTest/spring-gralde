package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class SpringController {
	
	  @Value("${message}")
	    private String message;
	  
	@RequestMapping(value="/greeting")
	public String greetings()
	{
		return message + "test with Gradle"; 
	}


}
