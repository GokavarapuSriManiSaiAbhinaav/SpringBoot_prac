package com.jenkinslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPracApplication.class, args);
		System.out.println("Backend is running");
	}

}
