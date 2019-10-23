package com.h2k.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello !!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);

	}

}
