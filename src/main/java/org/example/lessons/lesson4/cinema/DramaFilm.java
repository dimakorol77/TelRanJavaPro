package org.example.lessons.lesson4.cinema;

// Класс для драм
public class DramaFilm implements Film {
    private String title;

    public DramaFilm(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return "Drama";
    }
}