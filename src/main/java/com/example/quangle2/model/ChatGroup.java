package com.example.quangle2.model;

import jakarta.persistence.Entity;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class ChatGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@OneToOne(mappedBy = "group", cascade = CascadeType.ALL)
	private Hangout hangout;
	
	@OneToMany
	private List<Message> messages;

	@ManyToMany
	private Set<User> users;
	
	public ChatGroup() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hangout getHangout() {
		return hangout;
	}

	public void setHangout(Hangout hangout) {
		this.hangout = hangout;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

}
