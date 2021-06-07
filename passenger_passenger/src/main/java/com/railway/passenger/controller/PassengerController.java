package com.railway.passenger.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {
	
	@GetMapping("/demo")
	public String demo() {
		return "Passenger Service";
	}

}
