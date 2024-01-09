package com.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsProj4SpringCloudConfigServerExternalConigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj4SpringCloudConfigServerExternalConigApplication.class, args);
	}

}
