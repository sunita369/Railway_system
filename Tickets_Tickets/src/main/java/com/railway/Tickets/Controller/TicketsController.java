package com.railway.Tickets.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TicketsController {
	
	@GetMapping("/demo")
	public String demo() {
		return "Ticket Reservation Service";
	}

}
