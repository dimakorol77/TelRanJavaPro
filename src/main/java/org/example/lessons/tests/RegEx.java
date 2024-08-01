package org.example.lessons.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String  text = "Hello, girls. This is the first email for you dimaking@gmail.com\n" +
        "keep in touch. And here is the second one annagontar@gmail.com";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group(2));

        }
    }
}
