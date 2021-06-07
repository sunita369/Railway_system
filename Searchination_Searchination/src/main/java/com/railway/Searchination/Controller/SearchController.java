package com.railway.Searchination.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
	@GetMapping("/demo")
	public String demo() {
		return "Searching Service";
	}



}
