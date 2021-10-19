package com.example.sfgbeedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"web.service","web.controller"})
public class SfgbeedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgbeedemoApplication.class, args);
	}

}
