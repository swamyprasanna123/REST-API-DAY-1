package com.example.demo.day1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
	
@RestController
public class DAY2 {
	@Value("${greeting.message}")
	private String message;
	@GetMapping("/message")
	public String handler() {
		return message;
	}

}