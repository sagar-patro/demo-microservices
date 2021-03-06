package com.sagarp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeHibernateApplication.class, args);
	}

}
