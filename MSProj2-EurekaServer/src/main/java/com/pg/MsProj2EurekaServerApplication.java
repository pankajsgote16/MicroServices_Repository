package com.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsProj2EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj2EurekaServerApplication.class, args);
	}

}
