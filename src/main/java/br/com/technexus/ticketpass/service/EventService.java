package br.com.technexus.ticketpass.service;

import br.com.technexus.ticketpass.domain.Address;
import br.com.technexus.ticketpass.domain.Event;
import br.com.technexus.ticketpass.repository.AddressRepository;
import br.com.technexus.ticketpass.repository.EventRepository;
import br.com.technexus.ticketpass.util.dto.EventRequestDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final AddressRepository addressRepository;

    // Constructor injection
    EventService(EventRepository eventRepository, AddressRepository addressRepository) {
        this.eventRepository = eventRepository;
        this.addressRepository = addressRepository;
    }

    public Event findById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public Event create() {
        Address address = new Address(
                null,
                "123",
                "Main St",
                "New York",
                "NY",
                "10001",
                "USA",
                "Close to starbucks"
        );
        addressRepository.save(address);

        Event event = new Event(
                null,
                "Test Event",
                "This is a test event",
                95.0,
                LocalDateTime.of(2025, 3, 31, 10, 0),
                LocalDateTime.of(2025, 4, 1, 18, 0),
                address
        );
        return eventRepository.save(event);
    }

}
