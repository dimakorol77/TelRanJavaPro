package org.example.lessons.lesson4.cinema;

// Класс для комедий
public class ComedyFilm implements Film {
    private String title;

    public ComedyFilm(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }
}