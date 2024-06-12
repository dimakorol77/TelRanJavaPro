package org.example.lessons.homeworks.figureSquare;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calculateFigureSquare() {
        double s = (a+ b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public boolean isRightTriangle() {
        return (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);
    }
}
