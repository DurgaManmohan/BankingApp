package com.usecase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@SpringBootApplication
@EnableEurekaClient

public class ModuleAccountInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleAccountInformationApplication.class, args);
	}

}
