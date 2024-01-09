package com.pg.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingInfoController {

	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanstanceId;
	
	
	
	@GetMapping("/info")
	public ResponseEntity<String> fetchBillingDetails() {
		return new ResponseEntity<String>("Billing Info Service Instance "+"Port-"+port+"InstanceId-"+instanstanceId, HttpStatus.OK);
	}

}
