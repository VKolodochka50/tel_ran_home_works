package de.telran.homeWork_02_10_2023;

import java.util.Scanner;

public class wordsTransform {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first word");
        String wordOne = scan.nextLine();
        System.out.println("Please enter the second word");
        String wordTwo = scan.nextLine();
        String newString = wordScissor(wordOne, 0, halfWordCount(wordOne))
                + wordScissor(wordTwo, 0, halfWordCount(wordTwo));

        //If one or both words is not even
        if (isNotEven(wordOne, wordTwo)) {
            System.out.println("Please type a word with even character quantity. ");
        }
        //If both words are even
        else
            System.out.println("New word - " + newString);
        }


    //Cut a string according to coordinates
    public static String wordScissor(String str, int int1, int int2) {
        String newStr = str.substring(int1, int2);
        System.out.println(newStr);
        return newStr;
    }

    //Count half characters in provided word
    public static int halfWordCount(String str) {
        int count;
        count = charCount(str) / 2;
        // System.out.println("Calculated half-word length: " + count);
        return count;
    }

    //Count full word length
    public static int charCount(String str) {
        System.out.println("The character count in this word: " + str.length());
        return str.length();
    }

    //Making sure that provided word contains even characters quantity
    public static boolean isNotEven(String str, String str2) {
        if (str.length() % 2 != 0) {
            return true;
        }
            else if (str2.length() % 2 != 0) {
            return true;
        } return false;
    }

}
//1 уровень сложности: №1
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества
// букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй
// половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa