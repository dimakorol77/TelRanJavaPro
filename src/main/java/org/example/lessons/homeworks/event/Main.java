package org.example.lessons.homeworks.event;

// Main.java
import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        EventRepository eventRepository = new InMemoryEventRepository();

        Host host = new Host();
        host.setId(UUID.randomUUID());
        host.setEmail("host@example.com");
        host.setDisplayName("John Doe");
        host.setUsername("johndoe");
        host.setImage("path/to/image");

        Event event = new Event();
        event.setId(UUID.randomUUID());
        event.setTitle("Sample Event");
        event.setDate(LocalDateTime.now());
        event.setDescription("This is a sample event.");
        event.setEventTypeCategory("Conference");
        event.setCancelled(false);
        event.setHost(host);

        // Create Event
        eventRepository.createEvent(event);

        // Read Event
        Event fetchedEvent = eventRepository.getEventById(event.getId());
        System.out.println("Fetched Event: " + fetchedEvent.getTitle());

        // Update Event
        fetchedEvent.setTitle("Updated Event");
        eventRepository.updateEvent(fetchedEvent);

        // Read All Events
        System.out.println("All Events: " + eventRepository.getAllEvents().size());

        // Delete Event
        eventRepository.deleteEvent(fetchedEvent.getId());
        System.out.println("All Events After Deletion: " + eventRepository.getAllEvents().size());
    }
}

