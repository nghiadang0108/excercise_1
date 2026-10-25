package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Candidate candidate = new Candidate("1", "nghia", "nghiadang@gmail.com", 123456789);

        candidate.sendNotification("hello");
	}

}
