//Client Component
package com.pg.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {

	@Autowired
	private DiscoveryClient client;

	public String getBillingInfo() {
		// Get Billing Service Instance
		List<ServiceInstance> listInstances = client.getInstances("Billing-Service");
		// Get Single Instance from Single Instance(no load balancing here)
		ServiceInstance instance = listInstances.get(0);
		// Get Details from Service Instance
		/*
		 * Uri will give only base path we have to concat further part i.e
		 * http://localhost:9090 (URI) http://localhost:9090/billing/api/info (URL) 
		 * URL = URI + Path
		 */
		URI uri = instance.getUri();
		// prepare provider MS related url to consume methods

		String url = uri.toString() + "/billing/api/info";

		// Create RestTemplate class obj to consume the provider Service
		RestTemplate template = new RestTemplate();
		// Consume the provider Service
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		// Get response content from response entity obj
		String responseContent = response.getBody();

		return responseContent;
	}

}
