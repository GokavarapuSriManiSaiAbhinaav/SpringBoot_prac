package com.jenkinslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsPracApplication extends SpringBootServletInitializer{ 
	

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPracApplication.class, args);
		System.out.println("Backend is running");
	}

}
