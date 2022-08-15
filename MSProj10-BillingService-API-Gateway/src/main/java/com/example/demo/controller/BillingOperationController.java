package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillingOperationController {

	
	
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/billing")
	public String shopping() {
		
		System.out.println("callling BillingOperationController service");
		System.out.println("callling BillingOperationController service");
		String resp = template.getForObject("http://localhost:9993/payment", String.class);
		System.out.println("respone from payment   service");
		return resp;
	}
}
