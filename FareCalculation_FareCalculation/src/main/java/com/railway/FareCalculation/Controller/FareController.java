package com.railway.FareCalculation.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FareController {
	@GetMapping("/demo")
	public String demo() {
		return "Fare Calculation Service";
	}


}
