package org.example.lessons.tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4Stream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,222,15,34,3);



        List<Integer> result = integerList.stream()
                .filter(n -> n%2 == 0) // Отфильтровать четные числа
                .filter(n -> n > 10)    // Оставить числа больше 10
                .map(n -> n * 2)        //множим отфильтрованные числа на 2
                .sorted((a, b) -> b - a)  //сортируем в порядке убывания
                .collect(Collectors.toList());  //собрали в список


        System.out.println(result);
    }
}

