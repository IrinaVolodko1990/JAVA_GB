package ru.geekbrains.OOP.seminars.seminar1;


//Дан массив nums = [3,2,5,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно
//перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов
//массива должны быть отличны от заданного, а
//остальные - равны ему.

import java.util.Arrays;

public class Lection_1_task3 {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 3};
        int value = 3;
        int[] sortedArr = sortArr(array, value);
        System.out.println(Arrays.toString(sortedArr));
    }

    static int[] sortArr(int[] arr, int val) {
        int[] sortedArray = new int[arr.length];
        Arrays.fill(sortedArray, val);

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                sortedArray[j] = arr[i];
                j++;
            }
        }
        return sortedArray;

    }




}
