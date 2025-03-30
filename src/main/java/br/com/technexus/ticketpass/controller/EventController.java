package br.com.technexus.ticketpass.controller;

import br.com.technexus.ticketpass.domain.Event;
import br.com.technexus.ticketpass.service.EventService;
import br.com.technexus.ticketpass.util.dto.EventRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping()
     public ResponseEntity<List<Event>> listEvents() {
         return ResponseEntity.ok(
                 eventService.findAll()
         );
     }

     @GetMapping("/{eventId}")
     public ResponseEntity<Event> getEventById(@PathVariable String eventId) {
         return ResponseEntity.ok(
                 eventService.findById(Long.parseLong(eventId))
         );
     }

     @PostMapping("/create")
     public ResponseEntity<Event> createEvent() {
         return ResponseEntity.ok(
                 eventService.create()
         );
     }

}
