package org.example.lessons.lesson29072024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CommonChar {

    public static void main(String[] args) {
        String[] stringArr = {"ock", "coiu", "cozh"};

        // Сортируем массив строк по длине, чтобы самая короткая строка была первой
        List<String> newList = Arrays.stream(stringArr)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(newList);

        List<Character> commonCharsList = new ArrayList<>();
        int minLengthSize = newList.get(0).length();

        // Ошибка: Берем первый символ первой строки всегда
        // char currentChar = newList.get(0).charAt(0);

        // Как должно быть: нужно брать каждый символ первой строки по очереди
        for (int i = 0; i < minLengthSize; i++) {
            char currentChar = newList.get(0).charAt(i);
            boolean isCommon = true;

            for (int j = 1; j < newList.size(); j++) {
                // Ошибка: Сравниваем символы на позиции i всех строк
                // if (currentChar == newList.get(j).charAt(i)) {

                // Как должно быть: проверяем наличие символа currentChar в каждой строке
                if (!newList.get(j).contains(String.valueOf(currentChar))) {
                    isCommon = false;
                    break;
                }
            }

            // Ошибка: Добавляем символы на каждой итерации внутреннего цикла
            // commonCharsList.add(currentChar);

            // Как должно быть: добавляем символ только если он общий и еще не добавлен
            if (isCommon && !commonCharsList.contains(currentChar)) {
                commonCharsList.add(currentChar);
            }
        }

        // Выводим список уникальных общих символов
        System.out.println(commonCharsList);
    }
}
