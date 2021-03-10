package com.ryzhkov.sarafan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SarafanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SarafanApplication.class, args);
	}

}
