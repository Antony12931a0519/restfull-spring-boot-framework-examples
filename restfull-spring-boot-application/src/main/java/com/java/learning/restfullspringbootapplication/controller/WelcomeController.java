package com.java.learning.restfullspringbootapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facebook")
public class WelcomeController {

	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Hi Welcome to Facebook!";
	}

}
