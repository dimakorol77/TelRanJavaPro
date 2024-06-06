package org.example.lessons.lesson4.cinema;

// Класс для боевиков
public class ActionFilm implements Film {
    private String title;

    public ActionFilm(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return "Action";
    }
}