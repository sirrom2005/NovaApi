package com.rohanmorris.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NovaApplication {
	public static void main(String[] args) {
		SpringApplication.run(NovaApplication.class, args);
	}
}
