package com.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProj3BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj3BillingServiceApplication.class, args);
	}

}
