package de.telran.homeWork_05_10_2023;

public class calcUtils {

    public static int plus (int a, int b) {
        int i = a + b;
            System.out.print("Sum with " +a+ " and " +b+ " equals ");

        return i;
    }

    public static int minus (int a, int b) {
        int i = a - b;
            System.out.print("Subtract from " +a+ " and " +b+ " equals ");
        return i;
    }

    public static int myMultiply(int a, int b) {
        int i = 0;
        if ((a|b) > 0) {
            i = a * b;
            System.out.print("Multiply " +a+ " and " +b+ " equals ");
        }
        else {
            System.out.print("Please provide value greater than 0! ");
        }
        return i;
    }

    public static double divide (int a, int b) {
        double i = 0;
        if ((b) > 0) {
            i = (double) a / b;
            System.out.print("Divide " +a+ " by " +b+ " equals ");
        }
        else {
            System.out.print("Please provide value greater than 0! ");
        }
        return i;
    }
}
