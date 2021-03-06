package com.example.demo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
class ELKController {
	
	@Autowired
	RestTemplate restTemplete;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	 @RequestMapping("/")
	    public String index() {
	     
	 
	        return "<h3 style='text-align:center'>Howdy! This app is running perfectly!!!!</h3> <br/> <h3 style='text-align:center'>This app is created by Sandeep Yadav!</h3>";
	    }
	@GetMapping("/time")
	public String helloWorld() {
		String response = "<h3 style='text-align:center'>Welcome to Spring Boot Application : Current Time is " + new Date()+"</h3>";

		return response;
	}

	
}
