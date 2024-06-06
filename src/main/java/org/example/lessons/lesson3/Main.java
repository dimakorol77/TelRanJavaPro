package org.example.lessons.lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[2];
        Car car = new Car("Volvo", 123, "diesel");
        Bycicle bycicle = new Bycicle("BMW", 70, "monokoleso");
        vehicles[0]= car;
        vehicles[1] = bycicle;
        System.out.println(Arrays.toString(vehicles));

    }
}
