package com.app.start1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Backend1Application {

	@GetMapping("/msg")
	public static String message() {
		return "Welcome Shubham";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Backend1Application.class, args);
	}

}
