package org.example.lessons.homeworks.numStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Storage<T extends Number> {

    private List<T> items;

    public Storage() {
        this.items=new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    // Метод для получения элемента по индексу
    public T getItem(int index) {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Неправильный индекс");
        }
        return items.get(index);
    }

    // Метод для получения копии всех элементов списка
    public List<T> getAllItemsCopy() {
        return new ArrayList<>(items);
    }


    public double sumAllItems() {
        double sum = 0;
        for (T item : items) {
            sum += item.doubleValue();
        }
        return sum;
    }

    // Метод для добавления всех элементов из другого списка
    public void addAllItems(List<? extends Number> producers) {
        for (Number number : producers) {
            addItem((T) number);
        }
    }

    // Метод для заполнения коллекции элементами из списка Storage
    public void fillConsumers(List<? super Number> consumers) {
        for (Number number : items) {
            consumers.add(number);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage<?> storage = (Storage<?>) o;
        return Objects.equals(items, storage.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }


    public static class EmptyStorageException extends RuntimeException {
        public EmptyStorageException(String message) {
            super(message);
        }
    }

    // Метод для получения элемента с обработкой исключений, если контейнер пуст или индекс неверный
    public T getItemWithExceptionHandling(int index) {
        if (items.isEmpty()) {
            throw new EmptyStorageException("Контейнер пуст");
        }
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Неправильный индекс");
        }
        return items.get(index);
    }
}
