package com.SpringBoot.FirstSprintboot.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Login {
	
	@GetMapping("/showlogin")
	public String logindetails(){

		return "Username : "+ "\n"+ "Password : ";
		
	}
}
