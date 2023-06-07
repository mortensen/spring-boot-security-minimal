package de.javanachhilfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MinimalSpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(MinimalSpringBootApp.class, args);
	}

	@RestController
	public static class HelloController {

		@GetMapping("/")
		public String hello() {
			return "Hello, World!";
		}
		
		@GetMapping("/ignore")
		public String helloAnyways() {
			return "Hello, anyways!";
		}
	}
}