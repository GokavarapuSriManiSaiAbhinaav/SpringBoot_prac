package com.jenkinslab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ClientController {
	
	@GetMapping("/")
	public String springBootStatus() {
		return "SpringBoot running";
	}
	
	@GetMapping("/home")
	public String home() {
		return "SpringBoot Home";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "SpringBoot Profile";
	}

}
