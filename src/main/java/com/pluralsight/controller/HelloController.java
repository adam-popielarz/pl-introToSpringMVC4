package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping(value="/greeting.html")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello World");
		
		return "hello";
	}
	
}
