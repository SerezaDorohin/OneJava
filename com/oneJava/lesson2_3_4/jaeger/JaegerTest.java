package com.oneJava.lesson2_3_4.jaeger;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger(
                6,
                "2015", "Mark-1",
                "Destroyed", "Cherno Alpha",
                280, 2412, 3, 10, 10, 100);
        Jaeger jaeger2 = new Jaeger(
                3,
                "July 10, 2017", "Mark-3",
                "Destroyed", "Gipsy Danger", 260,
                1980, 7, 8, 6, 100);
        //-------Logic---------
        int h1 = jaeger1.getHealth();
        int h2 = jaeger2.getHealth();
        int ar1 = jaeger1.getArmor();
        int ar2 = jaeger2.getArmor();
        int fight = jaeger1.getArmor() - (jaeger2.getStrenght() - 3);
        if (jaeger1.getArmor() < jaeger2.getStrenght()) {
            h1 -= jaeger2.attack(jaeger1.getArmor());
        } else {
            ar1 -= fight;
        }
        System.out.println(h1);
    }
}