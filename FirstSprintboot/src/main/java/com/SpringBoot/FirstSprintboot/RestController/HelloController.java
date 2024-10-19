package com.SpringBoot.FirstSprintboot.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //stereo type annotation

public class HelloController{
	
	@GetMapping("/sayHello")
	public String Hello() {
		return "Hello!!! You are being introduced to Springboot....";
	}
}
