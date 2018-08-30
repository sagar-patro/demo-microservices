package citi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CitiEurekaTollrateBillboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiEurekaTollrateBillboardApplication.class, args);
	}
}
