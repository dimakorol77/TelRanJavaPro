package org.example.lessons.lesson1;

import java.util.Arrays;
import java.util.Random;


public class Test {
    static int[] arr = {14,1,7,5};
    static Random random = new Random();

//    static void result() {
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(1, 10);
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                continue;
//            }
//            temp += arr[i];
//        }
//        System.out.println(temp);
//
//
//    }
    public static void sumFirstWithLast(int arr []){
        
            int temp = 0;
            System.out.println(Arrays.toString(arr));

            for (int i = 0; i <= arr.length / 2; i++) {
                if (i == arr.length / 2 && arr.length % 2 != 0) {
                    // Если массив имеет нечетное количество элементов, вычитаем центральный элемент
                    temp -= arr[arr.length / 2];
                    System.out.println(temp);
                    return;
                } else if (i < arr.length / 2 || arr.length % 2 == 0) {
                    // Суммируем пары элементов
                    temp = arr[i] + arr[arr.length - 1 - i];
                    System.out.println(temp);
                }
            }
    }

public static void main(String[] args) {
sumFirstWithLast(arr);
//        result();


}


}


