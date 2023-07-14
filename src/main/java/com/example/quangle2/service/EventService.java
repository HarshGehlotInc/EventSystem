package com.example.quangle2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quangle2.model.ChatGroup;
import com.example.quangle2.model.Event;
import com.example.quangle2.model.EventResponse;
import com.example.quangle2.model.Hangout;
import com.example.quangle2.repo.EventRepo;

import com.example.quangle2.model.Utils;

@Service
public class EventService {
	
	@Autowired
	private EventRepo eventRepo;
	
	public void createEvent(Event event) {
		
		Hangout hang = new Hangout();
		ChatGroup group = new ChatGroup();
		group.setName(event.getTitle()+ " group ");
		hang.setGroup(group);
		hang.setEvent(event);
		event.setHangout(hang);
		
		eventRepo.save(event);
	}
	
	public List<EventResponse> getAllEvent(){
		return eventRepo.findAll().stream()
				.map(Utils :: convertToEventResponse)
				.collect(Collectors.toList());
	}
	
	public List<Event> getAllEventOfUser(){
		return null;
	}
	

}
