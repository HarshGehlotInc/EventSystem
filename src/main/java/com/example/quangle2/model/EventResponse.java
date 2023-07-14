package com.example.quangle2.model;

import java.util.Date;

public class EventResponse {

	private Long id;
	
	private String name;   
	private String address; 
	private String title;   
	private Date startDate;
	private Date endDate;
	private String details;

	private Long hangoutId;

	public EventResponse() {
		super();
	}

	public EventResponse(Long id, String name, String address, String title, Date startDate, Date endDate,
			String details, Long hangoutId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.details = details;
		this.hangoutId = hangoutId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Long getHangoutId() {
		return hangoutId;
	}

	public void setHangoutId(Long hangoutId) {
		this.hangoutId = hangoutId;
	}

	@Override
	public String toString() {
		return "EventResponse [id=" + id + ", name=" + name + ", address=" + address + ", title=" + title
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", details=" + details + ", hangoutId="
				+ hangoutId + "]";
	}	
}
