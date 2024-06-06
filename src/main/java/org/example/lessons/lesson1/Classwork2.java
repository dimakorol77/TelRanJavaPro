package org.example.lessons.lesson1;

import java.util.Arrays;
import java.util.Random;

public class Classwork2 {

   //Создание массивов:
        //
        //Создать массив String[] names для хранения имен.
        //Создать массив int[] ages для хранения возрастов.
        //Размер массивов — 10 элементов.
        //Создание людей:
        //
        //Создать метод createPerson, принимающий параметры String personName и int personAge. Метод должен добавлять имя и возраст в соответствующие массивы.
        //Проверить, что текущий индекс не превышает размер массива. Если превышает, метод должен завершаться без добавления нового человека.
        //Получение информации о человеке по ID:
        //
        //Создать метод getPersonById, который принимает int id и возвращает массив из двух элементов: имя и возраст (String[]).
   //  Если ID не существует (меньше нуля или больше текущего индекса), возвращать массив с значениями по умолчанию: {"empty", "-1"}.
        //Вывод информации о человеке по ID:
        //
        //Создать метод printPersonById, который принимает int id и выводит в консоль имя и возраст человека с данным ID. Если ID не существует, метод ничего не выводит.
        //Вывод информации о человеке из массива:
        //
        //Создать метод printPerson, который принимает массив из двух элементов (String[] person) и выводит информацию о человеке в консоль.
        //Изменение информации о человеке по ID:
        //
        //Создать метод updatePersonById, который принимает int id, String newName, int newAge и изменяет имя и возраст человека с данным ID. Если ID не существует, метод должен завершаться без изменений.
        //Заполнение и вывод данных:
        //
        //Создать цикл для добавления 10 человек с именами вида "Имя i" и случайными возрастами от 10 до 80 лет.
        //Выводить информацию о каждом созданном человеке с помощью метода printPersonById.
        //Удаление информации о человеке по ID:
        //
        //По указанному id человека удалить информацию о нём
   static String [] names= new String[10];
   static int [] ages = new int[10];
    static int count = 10;
    static int index=0;



    public  void createPerson (String personName, int personAge){
      if (count >= names.length) {
          return;
      }
      names[index]= personName;
      ages [index]= personAge;
      index ++;
    }
    //Создать метод getPersonById, который принимает int id и возвращает массив из двух элементов: имя и возраст (String[]).
    //  Если ID не существует (меньше нуля или больше текущего индекса), возвращать массив с значениями по умолчанию: {"empty", "-1"}.
    //Вывод информации о человеке по ID:
    public String [] getPersonById (int id) {
        if (id < 0 || id >=index) {
            return new String[]  {"empty","-1"};
        }
        return new String[]{names[id], String.valueOf(ages[id])};
    }
    //Создать метод printPersonById, который принимает int id и выводит в консоль имя и возраст человека с данным ID. Если ID не существует, метод ничего не выводит.
    //Вывод информации о человеке из массива:
    public void printPersonByID(int id) {
        // Проверка на допустимость индекса
        if (id < 0 || id >= count) {
            return;
        }
        // Проверка на наличие данных по указанному ID
        if (names[id] != null && ages[id] != 0) {
            System.out.println(names[id] + " " + ages[id]);
        }
    }
    //Создать метод printPerson, который принимает массив из двух элементов (String[] person) и выводит информацию о человеке в консоль.
    //Изменение информации о человеке по ID:
    // Метод для вывода информации о человеке
    public void printPerson(String[] person) {
        if (person != null && person.length == 2) {
            System.out.println("Name: " + person[0] + ", Age: " + person[1]);
        }
    }
    //Создать метод updatePersonById, который принимает int id, String newName, int newAge и изменяет имя и возраст человека с данным ID.
    // Если ID не существует, метод должен завершаться без изменений.
    //Заполнение и вывод данных:
    public void updatePersonByID (int id, String name, int newAge){
        if (id<0||id>=count){
            return;
        }
            names[id]=name;
            ages[id]=newAge;
        }

    //Создать цикл для добавления 10 человек с именами вида "Имя i" и случайными возрастами от 10 до 80 лет.
    //Выводить информацию о каждом созданном человеке с помощью метода printPersonById.






    public static void main(String[] args) {
        Classwork2 classwork2 = new Classwork2();
        Random random = new Random();
        for (int i = 0; i <count ; i++) {
            ages[i]= random.nextInt(10,81);
            names[i]="Dima"+i;
        }
        classwork2.printPersonByID(5);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(ages));

//        System.out.println(Arrays.toString(classwork2.names ));
//        System.out.println(Arrays.toString(classwork2.ages ));
    }
    }


