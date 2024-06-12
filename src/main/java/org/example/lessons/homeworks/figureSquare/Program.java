package org.example.lessons.homeworks.figureSquare;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(14));
        figures.add(new Triangle(11,12,14));

        for (Figure figure : figures) {
            System.out.println(figure.calculateFigureSquare());
        }



    }
}