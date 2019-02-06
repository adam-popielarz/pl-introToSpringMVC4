package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.model.Event;

@RestController
public class EventsReportController {

	@GetMapping("/events")
	public List<Event> getEvents(){
		
		List<Event> events = new ArrayList<>();
		Event event1 = new Event();
		event1.setName("JUG1");
		events.add(event1);
		Event event2 = new Event();
		event2.setName("JUG2");
		events.add(event2);
		
		return events;
		
	}

}