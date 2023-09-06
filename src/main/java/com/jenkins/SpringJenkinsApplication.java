package com.jenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class SpringJenkinsApplication extends SpringBootServletInitializer {
@PostConstruct
	public void intt(){
		log.info("application started..........");
	}

	@GetMapping("/get")
	public String get(){
	return "hi hello namaste";
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringJenkinsApplication.class);
	}

	public static void main(String[] args) {
		log.info("application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
