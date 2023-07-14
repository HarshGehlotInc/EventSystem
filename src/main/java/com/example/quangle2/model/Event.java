package com.example.quangle2.model;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;    // cage Sport
	private String address; // Brookfields Plaza 
	private String title;   // Match Day
	private Date startDate;
	private Date endDate;
	private String details;
	
	@OneToOne(cascade =CascadeType.ALL, fetch = FetchType.EAGER)
	private Hangout hangout;
	
//	@OneToMany(mappedBy="user")
//	private List<User> interestedPeople;

	public Event() {
		super();
	}
	
	public Event(Long id, String name, String address, String title, Date startDate, Date endDate, String details,
		Hangout hangout) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.details = details;
		this.hangout = hangout;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Hangout getHangout() {
		return hangout;
	}

	public void setHangout(Hangout hangout) {
		this.hangout = hangout;
	}
		
}