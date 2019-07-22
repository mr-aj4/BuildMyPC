package com.GRInfotech.BuildMyPC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.app.dao")
@EntityScan(basePackages="com.app.pojos")
public class BuildMyPcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildMyPcApplication.class, args);
	}

}
