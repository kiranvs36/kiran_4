package com.event.dao;

import com.event.entity.EventsAndActivities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventJpaRepository extends JpaRepository<EventsAndActivities, String>{
	
	public List<EventsAndActivities> findByUserId(String userId);

}
