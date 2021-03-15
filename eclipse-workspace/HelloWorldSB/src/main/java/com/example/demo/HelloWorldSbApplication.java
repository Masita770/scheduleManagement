package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSbApplication.class, args);
	}
	
	@GetMapping("/demo")
	public String demo(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello World!", name);
	}

}
