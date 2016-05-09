package com.typesafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class LivebeangraphApplication extends WebMvcAutoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(LivebeangraphApplication.class, args);
	}
}
