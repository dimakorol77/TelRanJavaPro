package org.example.lessons.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    static int[] arr = {1, 2, 4, 5, 7, 0, 7};

    //3: Проверьте, содержит ли массив заданный элемент.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
