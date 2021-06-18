package com.events.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.events.dao.EventJpaRepository;
import com.events.entity.EventsAndActivities;
import com.events.module.FilterCriteria;
import com.events.service.EventSearchService;

@Service
public class EventSearchServiceImpl implements EventSearchService {

	@Autowired
	private EventJpaRepository eventJpaRepository;
	@Override
	public List<EventsAndActivities> getUserEvents(String userId) {
		return eventJpaRepository.findByUserId(userId);
	}

	@Override
	public List<EventsAndActivities> getAllEvents() {
		return eventJpaRepository.findAll();
	}

	@Override
	public List<EventsAndActivities> getEventsByFilterCriteria(FilterCriteria criteria) {
		
		List<EventsAndActivities> events = eventJpaRepository.findByEventType(criteria.getEventType());
		return events;
	}

}
