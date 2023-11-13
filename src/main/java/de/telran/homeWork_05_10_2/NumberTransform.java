package de.telran.homeWork_05_10_2;

public class NumberTransform {
    public static void main(String[] args) {
        String myInt1 = "333";
        int myInt2 = 819;
        int myInt3 = 101101;
        int myInt4 = 124;

        int fact = 2;
        int fact16 = 16;

        System.out.println("Print number 333 from Hexadecimal to Decimal num " + decimalNum(myInt1, fact16));
        System.out.println("Print number 101101 from binary to Decimal num " + decimalNum(String.valueOf(myInt3), fact));
        System.out.println("Print number 124 from Decimal to Binary num " + binaryNum(myInt4));
        System.out.println("Print number 819 from Decimal to Hexadecimal num " + hexaDecimalNum(myInt2));

    }

    private static int decimalNum(String i, int factor) {
        //System.out.println(myInt);
        return Integer.parseInt(i, factor);
    }

    private static String hexaDecimalNum(int i) {
        //System.out.println(myI);
        return Integer.toHexString(i);
    }

    private static String binaryNum(int i) {
        return Integer.toBinaryString(i);
    }
}

//1 уровень сложности: N1
//Переведите число 333 из 16-ричной в 10-ричную
//Переведите число 819 из 10-ричной в 16-ричную
//101101 в двоичной, переведите в 10-ричную
//124 в десятичной, переведите в 2-ичную