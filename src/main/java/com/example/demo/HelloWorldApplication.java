package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class HelloWorldApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloWorldApplication.class, args);

		SpringApplication app = new SpringApplication(HelloWorldApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
