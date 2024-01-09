package com.pg.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationsController {

	@Autowired
	private BillingServiceConsumerClient billingServiceConsumerClient;

	@GetMapping("/cart")
	public ResponseEntity<String> doShopping() {
		//Use Client Component 
		String resultMsg = billingServiceConsumerClient.getBillingInfo();
		return new ResponseEntity<String>("Shopping Items (Shirt,Trouser..)"+resultMsg,HttpStatus.OK);
		
	}
}
