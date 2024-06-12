package org.example.lessons.homeworks.figureSquare;

public class Circle extends Figure {
  private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateFigureSquare( ) {
        return Math.PI * radius * radius;
    }
}
