package ru.geekbrains.lesson;
// 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
//2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например,
// с использованием циклов.
//3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
// Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
//4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

import java.util.Random;
import java.util.Scanner;

public class MyHW4_1 {
    public static char [][] map;
    public static final int SIZE = 3;
//    public static final int DON_TO_WIN = 3; //убран метод
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра завершена");
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map [i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формет X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }
    public static void aiTurn () {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в точку" + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean checkWin (char symb) {
        return (checkRow (symb)) || checkColumn(symb) || checkDiagonal(symb);
    }
    public static boolean checkRow (char symb) {
       for (int i = 0; i < SIZE; i++) {
           int counter = 0;
           for (int j = 0; j< SIZE; j++) {
               if (map[i][j] == symb) {
                   counter++; }
               if (counter == SIZE) {
                   return true;
               }
           }
       } return false;
    }
    public static boolean checkColumn (char symb) {
        for (int i = 0; i < SIZE; i++) {
            int counter = 0;
            for (int j = 0; j< SIZE; j++) {
                if (map[j][i] == symb) {
                    counter++; }
                if (counter == SIZE) {
                    return true;
                }
            }
        } return false;
    }
    public static boolean checkDiagonal (char symb) {
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map [i][i] == symb) {
                counter++; }
            if (counter == SIZE) {
                return true;
            }
        } return false;
    }
    public static boolean isMapFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        } return true;
    }
}
