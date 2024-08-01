package org.example.lessons.tests;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        /////////Java 5///////////////////
        List animals = new ArrayList();
        Animal newanimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(newanimal);
        Animal animal = (Animal) animals.get(3);
        System.out.println(animal);
        //////////// Generics ////////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");


        String animal2 = animals2.get(1);
        System.out.println(animal2);

        //////////////// java 7 //////////////////////////

        List<String> newList= new ArrayList<>();


    }
}
class Animal {

}
