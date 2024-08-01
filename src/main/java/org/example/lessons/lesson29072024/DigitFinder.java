package org.example.lessons.lesson29072024;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitFinder {




        public static boolean containsDigit(String text) {

            Pattern pattern = Pattern.compile(".*\\d.*");


            Matcher matcher = pattern.matcher(text);

            return matcher.matches();
        }

        public static void main(String[] args) {
            String testString1 = "Hello, world!";
            String testString2 = "Java4Ever";
            String testString3 = "NoDigitsHere";

            System.out.println(testString1 + " contains digit: " + containsDigit(testString1));
            System.out.println(testString2 + " contains digit: " + containsDigit(testString2));
            System.out.println(testString3 + " contains digit: " + containsDigit(testString3));
        }
    }


