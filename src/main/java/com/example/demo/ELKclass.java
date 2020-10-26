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
	     
	 
	        return "Howdy! This app is running perfextly!!!!";
	    }
	@GetMapping("/time")
	public String helloWorld() {
		String response = "Welcome to Spring Boot Application : Current Time is " + new Date();

		return response;
	}

	
}
