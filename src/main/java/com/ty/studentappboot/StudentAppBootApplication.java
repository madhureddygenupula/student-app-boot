package com.ty.studentappboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StudentAppBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppBootApplication.class, args);
	}
	
}
