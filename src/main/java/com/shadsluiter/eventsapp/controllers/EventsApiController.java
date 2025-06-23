
package com.shadsluiter.eventsapp.controllers;

import com.shadsluiter.eventsapp.models.EventModel;
import com.shadsluiter.eventsapp.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventsApiController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<EventModel> getAllEvents() {
        return eventService.findAll();
    }

    @PostMapping
    public EventModel createEvent(@Valid @RequestBody EventModel event) {
        return eventService.save(event);
    }

    @PutMapping("/{id}")
    public EventModel updateEvent(@PathVariable String id, @RequestBody EventModel event) {
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable String id) {
        eventService.delete(id);
    }
}
