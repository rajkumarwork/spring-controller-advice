package com.kc.advice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.kc.advice.*")
@EnableJpaRepositories
public class SpringAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdviceApplication.class, args);
	}

}
