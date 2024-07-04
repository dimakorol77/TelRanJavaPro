//package org.example.lessons.lesson8;
//
//import javax.xml.crypto.Data;
//import java.text.SimpleDateFormat;
//
//
//public class User {
//  String name;
//  String surname;
//  SimpleDateFormat date;
//  String description;
//
//    public User(String name, String surname, SimpleDateFormat date, String description)  {
//        if(name.length()>20) {
//            try {
//                throw new NameLenghtException("Вы ввели неккоректное имя");
//            } catch (NameLenghtException e) {
//                throw new RuntimeException(e);
//            }
//        } else      this.name = name;
//
//
//        if(surname.length()>20) {
//            throw new SurnameLengthException("Вы ввели неккоруктную фамилию");
//        }this.surname = surname;
//
//
//        this.date = date;
//        this.description = description;
//
//    }
//
//
//}
//  class NameLenghtException extends Exception {
//    public NameLenghtException(String m) {
//        super(m);
//    }
//
//  }
//  class SurnameLengthException extends Exception {
//    public SurnameLengthException (String m) {
//        super(m);
//    }
//  }
//  class CorrectDataException extends Exception {
//      public CorrectDataException(String m) {
//          super(m);
//      }
//  }
