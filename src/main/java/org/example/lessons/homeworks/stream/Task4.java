package org.example.lessons.homeworks.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Task4 {
    // Метод для преобразования элементов списка чисел с помощью унарного оператора
    public static List<Integer> transformList(List<Integer> numbers, UnaryOperator<Integer> operator) {
        List<Integer> transformed = new ArrayList<>();
        // Применяем оператор к каждому числу и добавляем результат в новый список
        for (Integer num : numbers) {
            transformed.add(operator.apply(num));
        }
        return transformed; // Возвращаем преобразованный список
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        UnaryOperator<Integer> increment = n -> n + 1; // Увеличиваем каждое число на 1
        List<Integer> incrementedNumbers = transformList(nums, increment);
        incrementedNumbers.forEach(System.out::println); // Выводим преобразованные числа
    }
}
