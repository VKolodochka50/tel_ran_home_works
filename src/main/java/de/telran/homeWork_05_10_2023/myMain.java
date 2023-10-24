package de.telran.homeWork_05_10_2023;

import static de.telran.homeWork_05_10_2023.calcUtils.*;

public class myMain {
    //Task 2
   public static int a = 100;
    public static int b = 7;
    public static void main(String[] args) {
        //Task 1
        String myStr = new String("I study Basic Java!");
        char prnSymb =myStr.charAt(strLength(myStr) -2);
        String searchWord = "Java";
        int start = startsAtIndex(searchWord, myStr); //locate index value for specific word
        String myStrCopy = myStr.substring(0, start); //Cut the specific word according to index

        System.out.println("Print my string in original case: " +myStr);
        System.out.println("Modified string " +myStrCopy);
        System.out.println("Replace all A to O: " +myStr.replace("a", "o"));
        System.out.println("Print my string in LOWER case: " +myStr.toLowerCase());
        System.out.println("Print my string in UPPER case: " +myStr.toUpperCase());
        printIfContains(myStr, searchWord);
        System.out.println("Предпоследним символом в строке " +myStr+ " будет -" +prnSymb);

        //Task 2
        System.out.println("to " +plus(a, b));
        System.out.println("to " +minus(a, b));
        System.out.println("to " +myMultiply(a, b));
        String div = String.format("%.2f", +divide(a, b));
        System.out.println("to " +div);

    }

    private static void printIfContains(String myStr, String searchWord) {
        if (myStr.contains(searchWord)) { //Search and print for specific word on success
            System.out.println(myStr);
        }
        else {
            System.out.println("The word Java has not been found in string");
        }
    }

    private static int strLength(String str) {
        return str.length();
    }
    private static int startsAtIndex (String str, String str2) {
        return str2.indexOf(str);
    }



}

//1 уровень сложности: № 1
//Создайте строку через new - I study Basic Java!
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//
//
//№ 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль