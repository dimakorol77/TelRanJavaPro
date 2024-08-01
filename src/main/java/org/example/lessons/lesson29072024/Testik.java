package org.example.lessons.lesson29072024;

public class Testik {
    public static void main(String[] args) {
        String s = "-123";
        String b = "333";
        String c = "+4333";
        String d = "333adsa111dsada787797";
        //  System.out.println(d.matches("[a-zA-Z13]+(-|\\+)?\\d*"));
        String f = "abcd";
        //System.out.println(f.matches("[^abc]*"));
        String url = "http://www.google.ua";
        String url1 = "http://www.yandex.ru";
       // System.out.println(url1.matches("http://www\\..+\\.(com|ru|ua)"));
        String z = "12332223323";
        System.out.println(z.matches("\\d{2,}"));
    }
}
