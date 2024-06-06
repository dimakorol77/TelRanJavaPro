package org.example.lessons.lesson4.cinema;
/*Создать класс Ticket, представляющий билет, который содержит информацию о пользователе, сеансе и месте.
 */
// Класс для билета
public class Ticket {
    private User user;
    private Session session;
    private String seat;

    public Ticket(User user, Session session, String seat) {
        this.user = user;
        this.session = session;
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public Session getSession() {
        return session;
    }

    public String getSeat() {
        return seat;
    }
}
