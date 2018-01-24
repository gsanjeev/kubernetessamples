package com.example.laxtech.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);

	}


	@RestController
	class HelloController {
		@GetMapping("/hello")
		String hello() {
			return "Hello Kubernauts!";
		}
	}
}

