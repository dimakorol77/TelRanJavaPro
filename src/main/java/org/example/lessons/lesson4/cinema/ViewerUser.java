package org.example.lessons.lesson4.cinema;

import java.util.ArrayList;
import java.util.List;


    // Класс для зрителя
    public class ViewerUser implements User {
        private String name;
        private List<Ticket> myTickets;

        public ViewerUser(String name) {
            this.name = name;
            this.myTickets = new ArrayList<>();
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getRole() {
            return "Viewer";
        }

        // Публичные методы для зрителя
        public void buyTicket(Session session, String seat) {
            if (session.getAvailableTickets() > 0) {
                Ticket ticket = new Ticket(this, session, seat);
                myTickets.add(ticket);
                session.setAvailableTickets(session.getAvailableTickets() - 1);
                System.out.println("Ticket bought for " + session.getFilm().getTitle() + " at " + session.getTime() + ", Seat: " + seat);
            } else {
                System.out.println("No tickets available for this session.");
            }
        }
        //Метод для просмотра всех билетов пользователя
        public void viewTickets() {
            for (Ticket ticket : myTickets) {
                System.out.println("Ticket for " + ticket.getSession().getFilm().getTitle() + " at " + ticket.getSession().getTime() + ", Seat: " + ticket.getSeat());
            }
        }
    }
