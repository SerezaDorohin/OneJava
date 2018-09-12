package com.oneJava.lesson8_9;

import java.util.ArrayList;

public class hw {

    public static void main(String[] args){
        ArrayList<Integer> array= new ArrayList<Integer>(2);
        array.add(5);
        System.out.println("Массив после: "+"array.add(5): "+array);
        array.add(6);
        System.out.println("Массив после: "+"array.add(6): "+array+"\nПосле данных операций мы" +
                " добави в массив числа 5,6, теперь массив состоит из них\n" +
                "В данный момент у 5 индекс 0, у 6 индекс 1");
        array.add(1,7);
        System.out.println("Массив после: "+"array.add(5): "+array+"\nМы вставили в середину массива " +
                "7\nТепер у 5 индекс 0, у 7 - 1, у 6 - 2");
        System.out.println("Вывод: "+"array.indexOf(6): "+array.indexOf(6)+"\nУ нас выводится 2," +
                "так как индекс числа 6 - 2");
        array.remove(1);
        System.out.println("Массив после: "+"array.remove(1): "+array+"\nМы" +
                "удаляем из массива число с индексом 1.\nТеперь индексы: 5-0,6-1");
        System.out.println("Вывод после: "+"array.indexOf(6): "+array.indexOf(6)+"\n" +
                "Мы выводим индекс числа 6, теперь он 1.\n" +
                "Поэтому сначала выводится 2, а потом 1");
    }
}
