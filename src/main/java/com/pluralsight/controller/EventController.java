package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pluralsight.model.Event;

@Controller
public class EventController {

	
	@GetMapping(value="/event")
	public String dispalyEventPage(Model model) {
		Event event = new Event();
		event.setName("JUG");
		model.addAttribute("event", event);
		
		return "event";
	}
	
}
