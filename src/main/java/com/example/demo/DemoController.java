package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class DemoController {

	@GetMapping("/test")
	public String getOrderTest() {
		
		return "Welcome to NAGP Batch 2022 : Microservices Session 2";
	}

}
