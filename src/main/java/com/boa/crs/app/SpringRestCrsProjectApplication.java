package com.boa.crs.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.boa.crs.app.repo")
@EntityScan("com.boa.crs.app.entity")
@ComponentScan({"com.boa.*"})
@EnableAutoConfiguration
@SpringBootApplication
public class SpringRestCrsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestCrsProjectApplication.class, args);
	}

}
