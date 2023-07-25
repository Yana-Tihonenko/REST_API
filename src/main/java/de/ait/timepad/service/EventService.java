package de.ait.timepad.service;

import de.ait.timepad.DTO.EventDTO;
import de.ait.timepad.DTO.NewEventDTO;

public interface EventService {

  EventDTO addEvent (NewEventDTO newEventDTO);
}
