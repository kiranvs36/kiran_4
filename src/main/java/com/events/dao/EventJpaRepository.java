package com.events.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.events.entity.EventsAndActivities;

@Repository
public interface EventJpaRepository extends JpaRepository<EventsAndActivities, String>{
	
	public List<EventsAndActivities> findByUserId(String userId);
	public List<EventsAndActivities> findByEventType(String eventTYpe);
	public List<EventsAndActivities> findByLocation(String location);
	public List<EventsAndActivities> findByEventName(String eventName);

}
