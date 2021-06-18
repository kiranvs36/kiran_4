package com.events.service;

import java.util.List;

import com.events.entity.EventsAndActivities;
import com.events.module.FilterCriteria;

public interface EventSearchService {
	
	public List<EventsAndActivities> getUserEvents(String userId);
	public List<EventsAndActivities> getAllEvents();
	public List<EventsAndActivities> getEventsByFilterCriteria(FilterCriteria criteria);

}
