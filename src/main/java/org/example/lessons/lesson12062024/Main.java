//package org.example.lessons.lesson12062024;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Person person1 = new Person("Dima", "Korol", 23000);
//        Person person2 = new Person("Dina", "Korol", 2300);
//        Person person3 = new Person("Inna", "Korol", 2300);
//
//        List<Person> personList = List.of(person1, person2, person3);
//
//        Map<String, Double> mapPerson = new HashMap<>();
//
//        for (Person person : personList) {
//            if (person.getSalary() < 30000) {
//                mapPerson.put(person.getName() + " " + person.getSurname(), person.getSalary());
//            }
//        }
//
//        for (Map.Entry<String, Double> entry : mapPerson.entrySet()) {
//            System.out.println( entry.getName() + entry.getSurname(), entry.getSalary());
//        }
//    }
//
//}
//
//  //  class Person implements Comparable {
//        private String name;
//        private String surname;
//        private double salary;
//
//
//        public Person(String name, String surname, double salary) {
//            this.name = name;
//            this.surname = surname;
//            this.salary = salary;
//        }
//
//
//        public String getName() {
//            return name;
//        }
//
//        public String getSurname() {
//            return surname;
//        }
//
//        public double getSalary() {
//            return salary;
//        }
//
//   //     @Override
////        public int compareTo(Object o) {
////            if(this.name.length()>o.getName().length()){
////                return 1;
////
////        } else if (this.name.length()<o.getName().length()) {
////                return  -1;
////            }else return 0;
////        }
//}
