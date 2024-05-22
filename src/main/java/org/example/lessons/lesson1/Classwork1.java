package org.example.lessons.lesson1;

public class Classwork1 {
    static int COUNT = 10;
    static int index = 0;
    static String[] names = new String[COUNT];
    static int[] ages = new int[COUNT];

    static void createPerson(String personName, int personAge) {
        names[index] = personName;
        ages[index] = personAge;
    }

    static String[] getPersonById(int id) {
        if (id < 0 || id >= index) {
            return new String[]{"empty", "-1"};
        }
        return new String[]{names[id], String.valueOf(ages[id])};
    }

    public static void main(String[] args){
        createPerson("Имя", 23);
    }
}
