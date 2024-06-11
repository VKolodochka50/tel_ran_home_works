package de.telran.homeWork_05_10_2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

//import static java.lang.Character.TITLECASE_LETTER;
import static java.lang.Character.isAlphabetic;

public class CurrencyConverter {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the amount in EUR to convert ");
            String amount = scanner.nextLine();
            System.out.println("Please enter an accurate value of EUR to USD currency rate ");
            double curRate = defaultRate(sc.nextLine());
            double result = (usdConverter(amount, curRate) / 10000);
            System.out.println("You have asked to convert " +amount + " EUR to USD " + df.format(result));
    }

    public static double defaultRate(String rate) {
            if (rate.contains(" ") ||
                    rate.isEmpty() ||
                    !rate.contentEquals(".*\\d.*") ||
                    rate.contains("0")) {
                return 1.09;
            }
            return Double.parseDouble(rate);

    }


    private static double usdConverter(String cur, double rate) {
        //parse original amount to coins
        if (cur.contains(" ") ||
                cur.isEmpty() ||
                cur.contains("0") ||
                !cur.contentEquals(".*\\d.*")) {
        }
            return 1;
       /* {
            int curs = (int) ((rate) * 100);
        //    int res = coins * curs;
        }
        return 929292;*/
    }

}
//Программа запрашивает у пользователя сумму в Евро для конвертации
//Реализовать метод, который конвертирует полученную сумму в сумму в долларах США