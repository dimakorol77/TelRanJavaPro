package org.example.lessons.lesson12062024.view;

import org.example.lessons.lesson12062024.controller.ContactServiceImpl;
import org.example.lessons.lesson12062024.model.Contact;
import org.example.lessons.lesson12062024.model.ContactService;

import java.util.Scanner;

public class ConsoleLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContactService contactService = new ContactServiceImpl();

        System.out.println("Введите имя контакта");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона");
        String phoneNumber = scanner.nextLine();
        System.out.println("Введите email");
        String email= scanner.nextLine();

        Contact newContact  =new Contact(name,phoneNumber, email);

        contactService.add(newContact);
    }



}
