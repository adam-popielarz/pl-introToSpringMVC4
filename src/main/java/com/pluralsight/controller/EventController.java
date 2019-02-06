package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

	
	@GetMapping(value="/event")
	public String dispalyEventPage(Model model) {
		Event event = new Event();
		event.setName("JUG");
		model.addAttribute("event", event);
		
		return "event";
	}
	
	@PostMapping(value="/event")
	public String processEvent(@ModelAttribute("event") Event event ) {
		System.out.println(event);
		
		
		return "redirect:index.jsp";
	}
	
	
	
}
