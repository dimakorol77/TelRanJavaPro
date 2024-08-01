package org.example.lessons.lesson29072024;
import java.util.Arrays;

public class IsValidIp {


        public static void isValidIPv4(String ip) {

//            Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})$");
//
//            Matcher matcher = pattern.matcher(ip);
//
//            return matcher.matches();

            String [] str =ip.split("\\.");

            for (int i = 0; i < str.length ; i++) {
                System.out.println(str[i]);
            }


        }

        public static void main(String[] args) {
            String testIP1 = "000.000.1.1";
            isValidIPv4(testIP1);
//            String testIP2 = "000.255.256.255";
//            String testIP3 = "0.256.256.256";
//            String testIP4 = "192.168.01.1";
//
//            System.out.println(testIP1 + " is valid: " + isValidIPv4(testIP1));
//            System.out.println(testIP2 + " is valid: " + isValidIPv4(testIP2));
//            System.out.println(testIP3 + " is valid: " + isValidIPv4(testIP3));
//            System.out.println(testIP4 + " is valid: " + isValidIPv4(testIP4));
        }
    }


