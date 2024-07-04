package org.example.lessons.homeworks.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Task1Stream {

        // Метод для фильтрации списка строк по предикату
        public static List<String> filterStrings(List<String> strings, Predicate<String> condition) {
            List<String> result = new ArrayList<>();
            // Пробегаем по каждой строке в исходном списке
            for (String str : strings) {
                // Проверяем строку на соответствие предикату
                if (condition.test(str)) {
                    result.add(str);
                }
            }
            return result; // Возвращаем отфильтрованный список
        }

        public static void main(String[] args) {
            List<String> words = List.of("apple", "banana", "kiwi", "strawberry", "orange");
            Predicate<String> longerThanFive = s -> s.length() > 5;
            List<String> filteredWords = filterStrings(words, longerThanFive);
            filteredWords.forEach(System.out::println); // Выводим отфильтрованные строки
        }
    }

