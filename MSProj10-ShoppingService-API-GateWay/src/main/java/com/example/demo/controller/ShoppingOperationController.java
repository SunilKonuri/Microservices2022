package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shoppingMs")
public class ShoppingOperationController {

	
	
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/shopping")
	public String shopping() {
		System.out.println("callling shopping service");
		System.out.println("callling shopping service");
		String resp = template.getForObject("http://localhost:9092/billing", String.class);
		
		System.out.println("response from billing service");
		return resp;
	}
}
