package de.ait.timepad.controller;

import de.ait.timepad.DTO.EventDTO;
import de.ait.timepad.DTO.NewEventDTO;
import de.ait.timepad.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/api/event")
@RequiredArgsConstructor
public class EventController {
  private final EventService eventService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public EventDTO addEvent(@RequestBody NewEventDTO newEventDTO) {
    return eventService.addEvent(newEventDTO);

  }
}
