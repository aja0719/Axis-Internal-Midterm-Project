package com.axis;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserServicesApplication {

	public static void main(String[] args) {
//		SpringApplication.run(UserServicesApplication.class, args);
		
		SpringApplication app = new SpringApplication(UserServicesApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "9088"));
		app.run(args);
	}

}
