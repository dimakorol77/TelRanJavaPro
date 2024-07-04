package org.example.lessons.homeworks.stream;
import java.util.List;
import java.util.function.Consumer;

public class Task2 {
    // Метод для обработки элементов списка чисел с помощью переданного действия
    public static void applyToEach(List<Integer> numbers, Consumer<Integer> action) {
        // Применяем действие к каждому числу в списке
        for (Integer num : numbers) {
            action.accept(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> values = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> printSquare = num -> System.out.println(num * num); // Печать квадрата числа
        applyToEach(values, printSquare);
    }
}
