package ru.geekbrains.myhw;

public class MyHW2 {
    public static void main(String[] args) {
        System.out.println("First exercise");
        System.out.println(methodName(16, 7));
        System.out.println(methodName(6, 7));
        System.out.println("\nSecond exercise");
        integerNumber();
        System.out.println("\nThird exercise");
        System.out.println(number(12));
        System.out.println("\nFourth exercise");
        cycles();
        System.out.println("\nFifth exercise");
        System.out.println(years(8));

    }

    public static boolean methodName(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void integerNumber() {
        int a = 3;
        if (a >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static boolean number(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void cycles() {
        int f = 4;
        String e = "text";
        for (int i = 0; i < 3; i++) {
            System.out.println(+f + e);
        }
    }

    public static boolean years(int a) {
        if ((a % 4 == 0) || ((a % 100 == 0) && !(a % 400 == 0))) {
            return true;
        } else {
            return false;
        }


    }
}