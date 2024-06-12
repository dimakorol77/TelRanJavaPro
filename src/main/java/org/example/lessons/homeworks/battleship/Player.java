package org.example.lessons.homeworks.battleship;

import java.util.Arrays;
import java.util.Random;

public class Player {
    private String name;
    private char[][] grid;
    private int[] shipsLeft;

    public Player(String name) {
        this.name = name;
        this.grid = new char[10][10];
        this.shipsLeft = new int[]{4, 3, 2, 1};
    }

    public boolean allShipsSunk() {
        for (int ship : shipsLeft) {
            if (ship > 0) return false;
        }
        return true;
    }


   //Реализация:
   //Создать класс BattleshipGame с методом main, который будет являться точкой входа в программу.
   //Создать класс Player с полями:
   //name - имя игрока;
   //grid - игровое поле, представленное двумерным массивом символов;
   //shipsLeft - массив, содержащий количество оставшихся кораблей каждого типа.
   //Реализовать следующие методы в классе Player:
   //Конструктор, принимающий имя игрока и инициализирующий игровое поле;
   //getName - метод для получения имени игрока;
   //allShipsSunk - метод, проверяющий, потоплены ли все корабли игрока;
   //placeShips - метод для расстановки кораблей на игровом поле;
   //receiveShot - метод для обработки выстрела противника.
   //В методе main класса BattleshipGame:
   //Создать объекты двух игроков;
   //Позволить игрокам расставить свои корабли;
   //Провести игру, пока не будет объявлен победитель.
    public void placeShips() {
        Random random = new Random();


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {
                int a = random.nextInt(0,10);
                int b =  random.nextInt(0,10);

                grid[a][b] = (char) ('0' + random.nextInt(4) + 1); // Заполнение числами от 1 до 4
            }
        }
        System.out.println(Arrays.deepToString(grid));
    }


    public String getName() {
        return name;
    }
}

