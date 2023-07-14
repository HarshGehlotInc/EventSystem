package com.example.quangle2.model;

public class Utils {
	
	public static EventResponse convertToEventResponse(Event event) {
		return new EventResponse(event.getId(), event.getName(), event.getAddress(), event.getTitle(), event.getStartDate(), event.getEndDate(),event.getDetails(), event.getHangout().getId());
	}
	
	public static HangoutResponse convertToHangoutResponse(Hangout hangout) {
		return new HangoutResponse(hangout.getId(), convertToEventResponse(hangout.getEvent()) );
	}
}


