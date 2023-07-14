package com.example.quangle2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.quangle2.model.Event;
import com.example.quangle2.model.EventResponse;
import com.example.quangle2.model.Hangout;
import com.example.quangle2.model.HangoutResponse;
import com.example.quangle2.service.EventService;
import com.example.quangle2.service.HangoutService;

@RestController
@RequestMapping("/api/v1")
public class BasicController {
	
	@Autowired
	private EventService eventService; 
	
	@Autowired
	private HangoutService hangoutService; 

	@GetMapping
	public String hello() {
		return "Welcome to Quangle";
	}
	
	@GetMapping("/event")
	public List<EventResponse> getEvents(){
		return eventService.getAllEvent();
	}
	
	@PostMapping("/event")
	public void createEvent(@RequestBody Event event) {
		eventService.createEvent(event);
	}
	
	@GetMapping("/hangout")
	public List<HangoutResponse> getHangout(){
		return hangoutService.getHangouts();
	}
	
	
	@GetMapping("/hangout/{id}")
	public Hangout getHangout(@PathVariable("id") Long id){
		return hangoutService.getHangoutById(id);
	}
	
}
