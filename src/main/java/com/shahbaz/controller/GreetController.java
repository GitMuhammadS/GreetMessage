package com.shahbaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
		
	@GetMapping("/")
	public String getGreet() {
		return "message";
	}
}
