package com.mss.instance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {
	
	
	@GetMapping("/hello")
	public String grettings() {
		return "hello pavan i love you";
	}

}
