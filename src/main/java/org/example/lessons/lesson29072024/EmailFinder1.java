package org.example.lessons.lesson29072024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
//Извлечение всех email адресов из текста
//Описание: Напишите программу, которая извлекает все email адреса из заданного текста.
//
//Пусть Email адреса имеют вид [nickname@домен_второго_уровня]
public class EmailFinder1 {

    public static List<String> extractEmails(String text) {



        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\\b");

        Matcher matcher = pattern.matcher(text);

        List<String> emails = new ArrayList<>();

        while (matcher.find()) {
            emails.add(matcher.group());
        }

        return emails;
    }

    public static void main(String[] args) {
        String text = "Here are some emails: john.doe@example.com, jane.doe@work-mail.net, test.email@domain.org. Contact us at support@mywebsite.com.";

        List<String> emails = extractEmails(text);

        System.out.println("Extracted emails:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}

