package ru.geekbrains.OOP.seminars.seminar2;
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит
//из чередующихся символов c1 и c2, начиная с c1.
//Ответ: c1c2c1…c2 (всего N символов)

public class Sem2_1 {
    public static void main(String[] args) {
        int size = 10;
        char c1 = '1';
        char c2 = '0';
        String newStr = buildStr(size, c1, c2);
        System.out.println(newStr);


    }

    static String buildStr(int size, char c1, char c2) {
        StringBuilder newStr = new StringBuilder();
        if (size % 2 == 0) {
            for (int i = 0; i < size; i++) {
                if (i % 2 != 0) {
                    newStr.append(c1);
                } else {
                    newStr.append(c2);
                }

            }
        } else {
            System.out.println("Wrong size!");
        }
        return newStr.toString();


    }
}
