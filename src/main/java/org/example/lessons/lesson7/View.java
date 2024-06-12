package org.example.lessons.lesson7;

import java.util.Scanner;

public class View {
    //Создать класс View для взаимодействия с пользователем:
    //
    //int getValue(String title): метод для получения значения от пользователя.
    //void print(int data, String title): метод для вывода результата на экран.
    Scanner scanner = new Scanner(System.in);

    public int getValue (String title) {
        System.out.println("Введите "+ title);
        return scanner.nextInt();
    }
    public void print(int data, String title){
        System.out.println(data +" "+title);
    }
}
