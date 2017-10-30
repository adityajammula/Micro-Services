package com.aditya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroServicesFundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesFundamentalsApplication.class, args);
	}
	
	@RequestMapping(value = "/greeting" , method= RequestMethod.GET)
	public String SayHello() {
		return "Hello from Spring Boot";
	}
	
}
