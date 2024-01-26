package ru.geekbrains.OOP.seminars.seminar1;

//  Дан массив двоичных чисел, например
//  [1,1,0,1,1,1], вывести максимальное
//  количество подряд идущих 1.
public class Lection_1_task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int max_count = 0;
        int temp_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp_count++;
                if (temp_count > max_count) {
                    max_count = temp_count;
                }
            } else {
                temp_count = 0;
            }

        }
        System.out.println(max_count);

    }
}
