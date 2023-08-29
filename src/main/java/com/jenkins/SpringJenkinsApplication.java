package com.jenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringJenkinsApplication {
@PostConstruct
	public void intt(){
		log.info("application started..........");
	}

	public static void main(String[] args) {
		log.info("application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
