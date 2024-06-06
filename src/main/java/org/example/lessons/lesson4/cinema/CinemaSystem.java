package org.example.lessons.lesson4.cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaSystem {
    private List<Film> films = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();

    public void addFilm(Film film) {
        films.add(film);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void viewAvailableSessions() {
        for (Session session : sessions) {
            System.out.println("Film: " + session.getFilm().getTitle() + ", Time: " + session.getTime() + ", Available Tickets: " + session.getAvailableTickets());
        }
    }

    public static void main(String[] args) {
        CinemaSystem cinemaSystem = new CinemaSystem();
        Film actionFilm = new ActionFilm("The Matrix");
        Film comedyFilm = new ComedyFilm("Me, my self and Iren");
        Film dramaFilm = new DramaFilm("The Notebook");

        cinemaSystem.addFilm(actionFilm);
        cinemaSystem.addFilm(comedyFilm);
        cinemaSystem.addFilm(dramaFilm);

        AdminUser admin = new AdminUser("Admin");
        ViewerUser viewer = new ViewerUser("Viewer");
        cinemaSystem.addUser(viewer);
        cinemaSystem.addUser(admin);

        Session session1 = new Session(actionFilm, "10:55", 90);
        Session session2 = new Session(comedyFilm, "18:30", 55);
        Session session3 = new Session(dramaFilm, "21:25", 100);

        admin.createSession(session1, cinemaSystem.sessions);
        admin.createSession(session2, cinemaSystem.sessions);
        admin.createSession(session3, cinemaSystem.sessions);


        // Зритель покупает билеты
        viewer.buyTicket(session1, "A1");
        viewer.buyTicket(session2, "B1");
        viewer.buyTicket(session3, "B2");

        // Просмотр доступных сеансов
        cinemaSystem.viewAvailableSessions();

        // Зритель просматривает свои билеты
        viewer.viewTickets();

    }
}

