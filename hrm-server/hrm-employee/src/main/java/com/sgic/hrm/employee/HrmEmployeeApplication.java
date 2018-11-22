package com.sgic.hrm.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.sgic.hrm.commons.entity")
@EnableJpaRepositories("com.sgic.hrm.commons.repository")
public class HrmEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmEmployeeApplication.class, args);
	}
}
