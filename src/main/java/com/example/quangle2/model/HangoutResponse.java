package com.example.quangle2.model;

public class HangoutResponse {

	private Long id;
	private EventResponse event;
	//private ChatGroup group;
	
	public HangoutResponse() {
		super();
	}
	
	public HangoutResponse(Long id, EventResponse event) {
		super();
		this.id = id;
		this.event = event;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EventResponse getEvent() {
		return event;
	}

	public void setEvent(EventResponse event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "HangoutResponse [id=" + id + ", event=" + event + "]";
	}
}
