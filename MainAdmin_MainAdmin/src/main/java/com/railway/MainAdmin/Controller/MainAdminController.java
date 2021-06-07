package com.railway.MainAdmin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainAdminController {
	
	@GetMapping("/demo")
	public String demo() {
		return "Admin Service";
	}


}
