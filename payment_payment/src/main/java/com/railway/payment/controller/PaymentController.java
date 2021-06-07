package com.railway.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@GetMapping("/demo")
	public String demo() {
		return "Payment Service";
	}


}
