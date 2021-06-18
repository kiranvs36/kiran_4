package com.event.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.dao.EventJpaRepository;
import com.event.entity.EventsAndActivities;
import com.event.module.FilterCriteria;
import com.event.service.EventSearchService;

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
		return null;
	}

}
