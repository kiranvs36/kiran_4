package com.events.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EVENTS_AND_ACTIVITIES")
public class EventsAndActivities {

	@Column(name="USER_ID", nullable=false)
	private String userId;
	@Column(name="EVENT_TYPE", nullable=false)
	private String eventType;
	@Column(name="EVENT_NAME", nullable=false)
	private String eventName;
	@Column(name="LOCATION", nullable=false)
	private String location;
	@Column(name="PRICE", nullable=false)
	private String eventPrice;
	@Column(name="EVENT_DATE", nullable=false)
	private String eventDate;
	@Column(name="EVENT_IMAGE_URL", nullable=false)
	private String eventImg;
	@Column(name="TIME_SLOT", nullable=false)
	private String timeSlot;
	@Column(name="NUMBER_OF_TICKET", nullable=false)
	private int ticketCount;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEventPrice() {
		return eventPrice;
	}
	public void setEventPrice(String eventPrice) {
		this.eventPrice = eventPrice;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventImg() {
		return eventImg;
	}
	public void setEventImg(String eventImg) {
		this.eventImg = eventImg;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	
	
}
