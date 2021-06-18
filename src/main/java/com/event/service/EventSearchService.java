package com.event.service;

import java.util.List;

import com.event.entity.EventsAndActivities;
import com.event.module.FilterCriteria;

public interface EventSearchService {
	
	public List<EventsAndActivities> getUserEvents(String userId);
	public List<EventsAndActivities> getAllEvents();
	public List<EventsAndActivities> getEventsByFilterCriteria(FilterCriteria criteria);

}
