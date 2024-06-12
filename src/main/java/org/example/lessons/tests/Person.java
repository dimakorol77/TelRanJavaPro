package org.example.lessons.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    int age;
    String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.name.length()) {
            return -1;
        } else if (this.name.length() < o.name.length()) {
            return 1;
        } else return 0;
    }
}

class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person(55, "Alexander"));
        person.add(new Person(12, "Oleg"));
        person.add(new Person(33, "Dimon"));

        Collections.sort(person);
        System.out.println(person);
    }
}