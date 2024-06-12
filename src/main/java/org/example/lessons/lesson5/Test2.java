package org.example.lessons.lesson5;

import java.util.Arrays;

public class Test2 {
    static int size=5;
  static   String [] strings = new String[size];

    public static void main(String[] args) {

        strings[0]="ddsfsdf";
        strings[1]="ddsfsdf";
        strings[2]="ddsfsdf";
        strings[3]="ddsfsdf";
        strings[4]="ddsfsdf";
        System.out.println(Arrays.toString(newArray()));

    }

    public static  String [] newArray () {
        String [] strings1= new String[size+1];
        for (int i = 0; i <strings.length ; i++) {
            strings1[i]=strings[i];

        }
        return strings1;
    }
}

