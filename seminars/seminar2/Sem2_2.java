package ru.geekbrains.OOP.seminars.seminar2;

//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.
//Результат: a4b3cd2


public class Sem2_2 {
    public static void main(String[] args) {
        String userStr = "aaaabbbcdd";
        System.out.println(compressedStr(userStr));
    }

    static String compressedStr(String str) {
        StringBuilder changedStr = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                changedStr.append(str.charAt(i - 1));
                if (count > 1) {
                    changedStr.append(count);
                }
                count = 1;
            }
        }
        changedStr.append(str.charAt(str.length() - 1));
        if (count > 1) {
            changedStr.append(count);
        }
        return changedStr.toString();
    }
}


