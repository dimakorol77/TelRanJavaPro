package org.example.lessons.homeworks.event;

// InMemoryEventRepository.java
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InMemoryEventRepository implements EventRepository {
    private List<Event> events = new ArrayList<>();

    @Override
    public void createEvent(Event event) {
        events.add(event);
    }

    @Override
    public Event getEventById(UUID id) {
        for (Event event : events) {
            if (event.getId().equals(id)) {
                return event;
            }
        }
        return null;
    }

    @Override
    public List<Event> getAllEvents() {
        return new ArrayList<>(events);
    }

    @Override
    public List<Event> findEventsByCriteria(String criteria) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if (event.getEventTypeCategory().contains(criteria) ||
                    event.getTitle().contains(criteria) ||
                    event.getDescription().contains(criteria)) {
                result.add(event);
            }
        }
        return result;
    }

    @Override
    public void updateEvent(Event event) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getId().equals(event.getId())) {
                events.set(i, event);
                break;
            }
        }
    }

    @Override
    public void deleteEvent(UUID id) {
        events.removeIf(event -> event.getId().equals(id));
    }
}
