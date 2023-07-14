package com.example.quangle2.model;

import jakarta.persistence.Entity;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Hangout {
	
	//fuck'em all
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(mappedBy= "hangout", cascade = CascadeType.ALL)
	private Event event;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ChatGroup group;
	
	//private Long creatorId; 

	public Hangout() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public ChatGroup getGroup() {
		return group;
	}

	public void setGroup(ChatGroup group) {
		this.group = group;
	}
	
}
