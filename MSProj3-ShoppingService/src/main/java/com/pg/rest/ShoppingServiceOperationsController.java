package com.pg.rest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.client.IBillingServiceConsumerClient;
@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationsController {

	@Autowired
	private IBillingServiceConsumerClient client;

	@GetMapping("/cart")
	public ResponseEntity<String> doShopping() {
		System.out.println("Proxy Class Name --> "+client.getClass()+"........"+Arrays.toString(client.getClass().getInterfaces()));
		ResponseEntity<String> fetchBillingInfo = client.fetchBillingInfo();
		return new ResponseEntity<String>("Shopping Items Shirt --> "+fetchBillingInfo,HttpStatus.OK);
		
	}
}
