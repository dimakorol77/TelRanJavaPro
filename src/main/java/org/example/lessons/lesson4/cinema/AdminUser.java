package org.example.lessons.lesson4.cinema;

import java.util.List;

// Класс для администратора
public class AdminUser implements User {
    private String name;

    public AdminUser(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    // Публичные методы для администрирования
    public void createSession(Session session, List<Session> sessions) {
        sessions.add(session);
        System.out.println("Session created: " + session.getFilm().getTitle() + " at " + session.getTime());
    }

    public void editSession(Session session, String newTime, int newAvailableTickets) {
        session.setTime(newTime);
        session.setAvailableTickets(newAvailableTickets);
        System.out.println("Session edited: " + session.getFilm().getTitle() + " now at " + session.getTime());
    }

    public void deleteSession(Session session, List<Session> sessions) {
        sessions.remove(session);
        System.out.println("Session deleted: " + session.getFilm().getTitle() + " at " + session.getTime());
    }
}