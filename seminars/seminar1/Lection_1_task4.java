package ru.geekbrains.OOP.seminars.seminar1;


//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке


public class Lection_1_task4 {
    public static void main(String[] args) {
        String userStr = "Добро пожаловать на курс по Java";
        String [] arrStr = userStr.split(" ");
        String reverseArr = "";
        for (int i = arrStr.length - 1; i >= 0 ; i--) {
            reverseArr += arrStr[i] + " ";
        }
        System.out.println(reverseArr.trim());
    }

}
