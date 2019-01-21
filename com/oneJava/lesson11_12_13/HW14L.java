package com.oneJava.lesson11_12_13;

import java.util.Arrays;

/*
 *
 * Задача:
 * Необходимо корректно реализовать слияние отсортированных по возрастанию массивов
 *
 * */

public class HW14L {
    public static void main(String[] args) {
        // Тестирование: (MERGE)
        System.out.println("Test1:\n" + Arrays.toString(merge(new int[]{1, 3, 2, 5, 4, 8, 6, 7}, new int[]{6, 8, 6, 5, 4, 9, 7, 6})) + "\n---------------------");
        System.out.println("Test2:\n" + Arrays.toString(merge(new int[]{2, 5, 4, 9, 1, 5, 3}, new int[]{3, 4, 8, 7, 9, 1, 5})) + "\n---------------------");
        System.out.println("Test3:\n" + Arrays.toString(merge(new int[]{5, 4, 8, 1, 2, 6, 5}, new int[]{5, 2, 9, 8, 1, 2, 3, 7})) + "\n---------------------");
        System.out.println("Test4:\n" + Arrays.toString(merge(new int[]{3, 8, 4, 9, 5, 6}, new int[]{3, 8, 4, 3, 9, 7})) + "\n---------------------");
        //----------------------
        // Тестирование: (Номера)
        // Номер 1
        ex1(3);
        ex1(8);
        ex1(10);
        // Номер 2
        ex2(9);
        ex2(4);
        ex2(3);
    // Номер 3
    ex3(5);
    ex3(2);
    ex3(4);
    //--------------------------
    // Тестирование: (Битовые сдвиги)
    bite(12, 2);
    bite(16, 1);
    bite(10, 1);
    //--------------------------
    // Тестирование: (И,ИЛИ,И Т.Д)
    or(5, 6);
    //--------------------------
}

    // Программа для двух массивов
    public static int[] merge(int[] fst/*Получаем первый массив*/, int[] snd/*Получаем второй массив*/) {
        int[] result = new int[fst.length + snd.length]; // Находим общую длину массивов
        for (int i = 0; i < fst.length; i++) {
            result[i] = fst[i]; // Сливаем с первым
        } // Массив result слит с первым массивом
        for (int i = 0; i < snd.length; i++) {
            result[i + fst.length] = snd[i]; // Слваем со вторым
        } // Массив result слит со вторым массивом
        Arrays.sort(result); // Сортируем слитый массив
        return result; // Возвращаем готовый массив
    }

    // Программа для номера 1
    public static void ex1(int n) {
        System.out.println("Номер 1");
        System.out.println("Число n: " + n + "\nЧисло 2 в n степени: " + (int) Math.pow(2, n) + "\n--------------------"); // Выводим
    }

    // Программа для номера 2
    public static void ex2(int num) {
        int result = Integer.parseInt(Integer.toBinaryString(num)); // Превращаем в десятичную
        System.out.println("Номер 2");
        System.out.println("Число в десятичной: " + result + "\n--------------------"); // Выводим
    }

    // Программа для номера 3
    public static int intForEx3;

    public static void ex3(int num) {
        intForEx3 = 0;
        String result = (Integer.toBinaryString(num)); // Превращаем в десятичную
        String[] masOfNums = result.split(""); // Перемещаем все знаения в массив
        for (String number : masOfNums) { // Создаем простой цикл
            int intNum = Integer.parseInt(number); // Переводим в int из String для ifа
            if (intNum == 1) { // Проверяем - равно ли единице
                intForEx3 += 1; // Если равно еденице - добавляем 1 к счетчику единиц
            }
        }
        System.out.println("Номер 3");
        System.out.println("Всего единиц: " + intForEx3 + "\n--------------------"); // Выводим
    }

    // Программа для битовых операций (побитовый сдвиг):
    public static void bite(int num, int n) {
        int result = num << n; // Сделали сдвиг влево на 1 бит
        System.out.println("Побитовый сдвиг влево:");
        System.out.println("Было: " + num + " || " + Integer.toBinaryString(num)); // Выводим как было
        System.out.println("Результат: " + result + " || " + Integer.toBinaryString(result) + "\n--------------------"); // Выводим как стало
    }

    // Выполнить логические побитовые операции "И", "ИЛИ" и др. над числами 5 и 6
    public static void or(int num1, int num2) {
        System.out.println("Играем с побитовыми операциями:");
        System.out.println(num1 + " & " + num2 + " = " + (num1 & num2)); // Выводим побитовый AND
        System.out.println(num1 + " | " + num2 + " = " + (num1 | num2)); // Выводим побитовый OR
        System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2)); // Выводим побитовый исключающее OR
        System.out.println("--------------------");
    }

}