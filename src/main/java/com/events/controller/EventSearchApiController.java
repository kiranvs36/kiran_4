package com.events.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.events.entity.EventsAndActivities;
import com.events.module.FilterCriteria;
import com.events.service.impl.EventSearchServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = "/events")
public class EventSearchApiController {

	private static final Logger logger = LoggerFactory.getLogger(EventSearchApiController.class);
	
	@Autowired
	private EventSearchServiceImpl eventSearchServiceImpl;
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@CrossOrigin
	@GetMapping(path = "/myEvents/{userId}")
	public ResponseEntity<?> getUserEvents(@PathVariable("userId")String userId)  {
		try {
			List<EventsAndActivities> myBookings = eventSearchServiceImpl.getUserEvents(userId);
			if(ObjectUtils.isEmpty(myBookings)){
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("RateId not found in RMS");
			}else {
			    return ResponseEntity.ok(mapper.writeValueAsString(myBookings));
			}
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception Occured when getting Events");
		}
	}
	
	@CrossOrigin
	@GetMapping(path = "/allEvents")
	public ResponseEntity<?> getAllEvents()  {
		try {
			List<EventsAndActivities> myBookings = eventSearchServiceImpl.getAllEvents();
			if(ObjectUtils.isEmpty(myBookings)){
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Events available");
			}else {
			    return ResponseEntity.ok(mapper.writeValueAsString(myBookings));
			}
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception Occured when getting Events");
		}
	}
	
	@CrossOrigin
	@GetMapping(path = "/allEventByEvents")
	public ResponseEntity<?> getEventsByFilter(@RequestBody FilterCriteria filterCriteria)  {
		try {
			List<EventsAndActivities> myBookings = eventSearchServiceImpl.getEventsByFilterCriteria(filterCriteria);
			if(ObjectUtils.isEmpty(myBookings)){
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Events available");
			}else {
			    return ResponseEntity.ok(mapper.writeValueAsString(myBookings));
			}
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception Occured when getting Events");
		}
	}
}
