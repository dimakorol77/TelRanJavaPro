package org.example.lessons.homeworks.numStorage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра Storage для Integer
        Storage<Integer> storage = new Storage<>();

        // Добавление элементов
        storage.addItem(10);
        storage.addItem(20);
        storage.addItem(30);
        System.out.println("Элементы после добавления: " + storage.getAllItemsCopy());

        // Удаление элемента
        storage.removeItem(20);
        System.out.println("Элементы после удаления 20: " + storage.getAllItemsCopy());

        // Получение элемента по индексу
        try {
            Integer item = storage.getItem(1);
            System.out.println("Элемент с индексом 1: " + item);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // Подсчет суммы всех элементов
        double sum = storage.sumAllItems();
        System.out.println("Сумма всех элементов: " + sum);

        // Добавление всех элементов из другого списка
        List<Integer> newItems = List.of(40, 50, 60);
        storage.addAllItems(newItems);
        System.out.println("Элементы после добавления из другого списка: " + storage.getAllItemsCopy());

        // Заполнение другой коллекции элементами из storage
        List<Number> consumers = new ArrayList<>();
        storage.fillConsumers(consumers);
        System.out.println("Элементы в другой коллекции после заполнения: " + consumers);

        // Тестирование метода с собственным исключением
        try {
            Storage<Integer> emptyStorage = new Storage<>();
            emptyStorage.getItemWithExceptionHandling(0);
        } catch (Storage.EmptyStorageException e) {
            System.out.println(e.getMessage());
        }

        // Тестирование equals и hashCode
        Storage<Integer> storage2 = new Storage<>();
        storage2.addItem(10);
        storage2.addItem(30);
        storage2.addItem(40);
        storage2.addItem(50);
        storage2.addItem(60);

        System.out.println("Storage и storage2 равны: " + storage.equals(storage2));
    }
}
