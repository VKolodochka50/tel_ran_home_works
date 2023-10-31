package de.telran.homeWork_02_10_2023;

public class HomeCalc {
    public static void main(String[] args) {

     int myInt1 = 12;
     int myInt2 = 7;

        System.out.println(myInt1+ " и " +myInt2+ " получаем " +makePlus(myInt1, myInt2));
        System.out.println(myInt2+ " из " +myInt1+ " получаем " +makeMinus(myInt1, myInt2));
        System.out.println(myInt1+ " на " +myInt2+ " получаем " +makeMultiply(myInt1, myInt2));
        System.out.println(myInt1+ " на " +myInt2+ " получаем " +makeDivide(myInt1, myInt2));

    }
    public static int makePlus (int i1, int i2) {
        System.out.print("В результате сложения ");
        return i1 + i2;
    }

    public static int makeMinus (int i1, int i2) {
        System.out.print("В результате вычитания ");
        return i1 - i2;
    }

    public static int makeMultiply (int i1, int i2) {
        System.out.print("В результате умножения ");
        return i1 * i2;
    }

    public static float makeDivide (int i1, int i2) {
        System.out.print("В результате деления ");
        return  (float) i1 / i2;
    }
}

//Pеализовать программу, выводящую на экран результаты:
//Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод