package org.example.lessons.tests.animal;

public class Animal {
    private int id;
    public Animal(){};
    public Animal(int id) {
        this.id=id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
}
    public  void eat (){
        System.out.println("Animal is eating");
    }
}