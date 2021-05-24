package com.cognizant.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesHandsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesHandsonApplication.class, args);
	}

}
