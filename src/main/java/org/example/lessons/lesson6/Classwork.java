package org.example.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Classwork {



    public int getSumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }



    public int getSumElofList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }







    public static void main(String[] args) {
    List <Integer> list = new ArrayList<>();

    }
}
