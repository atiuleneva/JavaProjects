package org.atiuleneva.dz1;

import java.time.Year;

public class Main {
    // #2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    int a = 1000000000;
    byte b = 100;
    short c = 10000;
    long d = 10000000000000L;
    float e = 1.0f;
    double f = 1.0;
    char g = '@';
    boolean i = true;
    String test = "Я изучаю Java!";

    //#1 прописать метод main
    public static void main (String [] args) {
        // #3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        int cfRez = calcFunc(10, 7, 20, 5);
        System.out.println("calcFunc = " + cfRez);

        //#4
        boolean tNum = testNumber(45,7);
        System.out.println("testNumber = " + tNum);

        // #5
        Number(-7 );
        Number(0 );
        Number(77);

        //#6
        boolean num2 = Number2 ( -33);
        System.out.println("a = " + num2);

        //#7
        printName ("Anna");

        //#8

        isLeapYear(2021);


    }





    //#3
    public static int calcFunc (int a, int b, int c, int d) {
        int rez = a * (b + (c / d));
        return rez;
    }

    // #4
    public static boolean testNumber (int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        else return false;
    }

    //# 5

    public static void Number (int a) {
        if (a >= 0) {
            System.out.println("a = " + a + " положительно");
        }
        else
            System.out.println( "a = " + a  + " отрицательно");
    }

    //#6
    public static boolean Number2 (int a) {
        if (a < 0){
            return true;
        }
        else return false;
    }

    //#7
    public static void printName ( String name){
        System.out.println("Hello, " + name + "!");
    }

    // #8

    public static void isLeapYear ( int a){
         if (a%400 == 0){
            System.out.println("Год високосный");
        }
        else if (a%100 == 0){
            System.out.println("Год невисокосный");
        }
        else if (a%4 == 0){
             System.out.println( "Год високосный");

        }
        else System.out.println("Год невисокосный");
    }


}

