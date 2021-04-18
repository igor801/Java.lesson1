package ru.geekbrains.lesson;

import java.util.Arrays;

public class MyHW3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(against()));
        System.out.println(Arrays.toString(integerArray()));
        System.out.println(Arrays.toString(array()));
        squareArray(4);
        System.out.println(Arrays.toString(argument(5, 5)));
    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] against() {
        int [] num = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
                for (int i = 0; i < num.length; i++)
                if (num [i] == 0) {
                    num [i] = 1;
                } else {
                    num [i] = 0;
                }
                return num;
    }
    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    //значениями 1 2 3 4 5 6 7 8 … 100;
    public static int[] integerArray() {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    //умножить на 2;
    public static int[] array() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
                arr [i] *= 2;
            }
        }
        return arr;
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    //(можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    //диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
    //[1][1], [2][2], …, [n][n];
    public static void squareArray (int size) {
        int [][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            int rowLength = arr[i].length;
            for (int j = 0; j < rowLength; j++) {
                if ((i == j) || (j == rowLength - 1 - i)) {
                    arr[i][j] = 1;
                }
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
            }
        System.out.println();
    }
    // 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    //одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] argument (int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue; }
        return arr;
        }


}




