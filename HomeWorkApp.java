package ru.geekbrains.myhw;

public class HomeWorkApp
{
    public static void main(String[] args)
    {
        System.out.println("По первому заданию метод Мэйн");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords()
    {
        System.out.println("По второму заданию:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
     public static void checkSumSign()
     {
         int a = 10;
         int b = -15;
         int c = a + b;
         System.out.println("По третьему заданию: результат равен" + c);
         if (c >= 0)
         {
             System.out.println("Сумма положительная");
         }
         if (c < 0)
         {
             System.out.println("Сумма отрицательная");
         }
     }
     public static void printColor()
     {
        int value = 105;
         System.out.println("По четвертому заданию: " + value);
         if (value <= 0)
         {
             System.out.println("Красный");
         }
         if (value > 0 && value <= 100)
         {
             System.out.println("Желтый");
         }
         if (value > 100)
         {
             System.out.println("Зеленый");
         }
     }
     public static void compareNumbers()
     {
         System.out.println("По пятому заданию:");
         int a = 12;
         int b = 18;
         if (a >= b)
         {
             System.out.println("a >= b");
         }
         if (a < b) {
             System.out.println("a<b");
         }
     }

     }



