package com.example.testfotmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.testformvc.model","com.example.testformvc.controller","com.example.testformvc.service","com.example.testformvc.repository"})
@EntityScan({"com.example.testformvc.model","com.example.testformvc.controller","com.example.testformvc.service","com.example.testformvc.repository"})
public class TestfotmvcApplication {
//你好
	public static void main(String[] args) {
		SpringApplication.run(TestfotmvcApplication.class, args);
	}

}
