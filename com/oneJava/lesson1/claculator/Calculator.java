package com.oneJava.lesson1.claculator;

/*
Задача:
Реализовать калькулятор

version: 2.0
*/
public class Calculator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        char matchOperation = '^';
        if (matchOperation == '+') {
            int end = num1 + num2;
            System.out.println(num1 + " " + matchOperation + " " + num2 + " " + "=" + " " + end);
        } else if (matchOperation == '-') {
            int end = num1 - num2;
            System.out.println(num1 + " " + matchOperation + " " + num2 + " " + "=" + " " + end);
        } else if (matchOperation == '/') {
            int end = num1 / num2;
            System.out.println(num1 + " " + matchOperation + " " + num2 + " " + "=" + " " + end);
        } else if (matchOperation == '*') {
            int end = num1 * num2;
            System.out.println(num1 + " " + matchOperation + " " + num2 + " " + "=" + " " + end);
        } else if (matchOperation == '%') {
            int end = num1 / num2;
        } else if (matchOperation == '^') {
            int s = 1;
            for (int i = 0; i < num2; i++) {
                s *= num1;
            }
            System.out.println(num1 + " " + matchOperation + " " + num2 + " " + "=" + " " + s);
        } else {
            System.out.println("ERROR:Invalid Operation(" + matchOperation + ")");
        }
    }
}