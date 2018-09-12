package com.oneJava.lesson2_3_4.sortirovka;

/*
Создать метод для сортировки массива без использование Arrays.sort();
V 1.0:
-> Программа создана.
* */

public class Sort {
    public static void main(String[] args) {
        int[] mas = {12, 56, 8, 54, 22, 6, 6, 4, 7, 8, 2, 0, 3};
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int buff = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buff;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
    }
}