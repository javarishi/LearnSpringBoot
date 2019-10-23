package com.h2k.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController - This is known as a stereotype annotation. 
 * It provides hints for people reading the code and for Spring that the 
 * class plays a specific role
 * @EnableAutoConfiguration - This annotation tells Spring Boot to “guess” how you want to configure Spring, 
 * based on the jar dependencies that you have added
 *
 */
@RestController
@EnableAutoConfiguration
public class Customer {
	
	
	
	/**
	 * The @RequestMapping annotation provides “routing” information.
	 * @return
	 */
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	
	public static void main(String[] args) {
		SpringApplication.run(Customer.class, args);
	}
}
