package com.eventmgt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventmgt.dto.EventDTO;

public interface EventDAO extends JpaRepository<EventDTO, Long>{
	
	public EventDTO findById(long id);
	public EventDTO findByType(String type);
	public EventDTO findByEventName(String eventName);

}
