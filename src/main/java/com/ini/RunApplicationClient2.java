package com.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RunApplicationClient2 {

	public static void main(String[] args) {
		SpringApplication.run(RunApplicationClient2.class, args);
	}
}
