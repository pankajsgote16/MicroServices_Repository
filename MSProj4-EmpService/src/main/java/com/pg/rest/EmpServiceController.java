package com.pg.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class EmpServiceController {

	@Value("${name}")
	private String DbUserFirstName;
	@Value("${surname}")
	private String DbUserLastName;
	

	@GetMapping("/show")
	public ResponseEntity<String> empDetails() {
		return new ResponseEntity<>("Properties From GitHub application pro file--Name = "+DbUserFirstName+" Surname = "+DbUserLastName, HttpStatus.OK);
	}
}
