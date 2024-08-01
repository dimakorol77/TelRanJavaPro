package org.example.lessons.lesson29072024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Задание 1: Проверка формата номера телефона
//Описание: Напишите программу, которая проверяет, соответствует ли строка формату номера
// телефона "(999)145-67-89 java regex

public class Lesson29072024 {
    public static boolean isValidPhoneNumber(String phoneNumber) {


        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}");


        Matcher matcher = pattern.matcher(phoneNumber);


        return matcher.matches();
    }

    public static void main(String[] args) {
        String test1 = "(999)145-67-89";
        String test2 = "999145-67-89"; // Неверный формат
        String test3 = "(123)456-78-90"; // Верный формат

        System.out.println(test1 + " is valid: " + isValidPhoneNumber(test1));
        System.out.println(test2 + " is valid: " + isValidPhoneNumber(test2));
        System.out.println(test3 + " is valid: " + isValidPhoneNumber(test3));
    }
}
