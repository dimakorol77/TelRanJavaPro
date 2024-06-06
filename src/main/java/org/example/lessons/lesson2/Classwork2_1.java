package org.example.lessons.lesson2;

import java.util.Arrays;

public class Classwork2_1 {

    public static void main(String[] args) {
        int[] arr = getRandomArray(10);
        int[] result1 = getAndCreateArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result1));
    }

    public static int[] getAndCreateArray(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    public static int[] getRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 5);
        }
        return array;
    }
}
