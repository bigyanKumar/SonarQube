package com.example.sonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarApplication {

	public static void main(String[] args) {
		System.out.println("Hello I am back.");
		SpringApplication.run(SonarApplication.class, args);
	}

}
