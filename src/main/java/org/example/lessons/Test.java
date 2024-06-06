package org.example.lessons;

import java.util.Arrays;
import java.util.Random;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15) - 7; // Генерирует числа от -7 до 7 включительно
        }

        System.out.println("Массив: " + Arrays.toString(arr));

        int sum = 0;
        int firstPosIndex = -1;
        int lastPosIndex = -1;

        // Поиск первого положительного элемента
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                firstPosIndex = i;
                break;
            }
        }

        // Поиск последнего положительного элемента
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= 0) {
                lastPosIndex = i;
                break;
            }
        }

        // Проверка индексов и вычисление суммы элементов между первым и последним положительными элементами
        if (firstPosIndex != -1 && lastPosIndex != -1 && firstPosIndex < lastPosIndex) {
            for (int i = firstPosIndex + 1; i < lastPosIndex; i++) {
                sum += arr[i];
            }
        }

        // Вывод результата
        System.out.println("Сумма элементов между первым и последним положительными элементами (включая нули): " + sum);
    }
}

