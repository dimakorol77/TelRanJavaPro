package org.example.lessons.lesson4.cinema;
/*Создать класс Session, представляющий сеанс, который содержит фильм, время и количество доступных билетов.
*/
// Класс для сеанса
public class Session {
    private Film film;
    private String time;
    private int availableTickets;

    public Session(Film film, String time, int availableTickets) {
        this.film = film;
        this.time = time;
        this.availableTickets = availableTickets;
    }

    public Film getFilm() {
        return film;
    }

    public String getTime() {
        return time;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }
}
