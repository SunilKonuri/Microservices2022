package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentOperationController {

	
	
	
	@GetMapping("/payment")
	public String shopping() {
		
		
		System.out.println("callling PaymentOperationController service");
		System.out.println("callling PaymentOperationController service");
		return "bill amount is :1500 Rs payment is done Using GooglePay";
	}
}
