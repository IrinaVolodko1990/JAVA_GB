package ru.geekbrains.OOP.seminars.seminar2;

//Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).
//Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
// А роза упала на лапу Азора


public class Sem2_3 {
    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";
        System.out.println(isPalindrom(text));

    }

    static boolean isPalindrom(String str) {
        str = str.toLowerCase();
        str = str.replace(" ", "");

//        1 option
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        if (reverseStr.toString().equals(str)) return true;
        else return false;
//        2 option

//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                return false;
//            }
//        }
//        return true;
    }
}


