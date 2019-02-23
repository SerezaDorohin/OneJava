package com.oneJava.lesson24.homework.lambda;

public class Main {

    public static void main(String[] args) {
        Operation operation = (d1, d2) -> d1 / d2;
        Printer printer = str -> System.out.println(str);
        Factorial factorial = value -> {
            int result = 1;
            for(int i = 1; i <= value; ++i) {
                result *= i;
            }
            return result;
        };

        System.out.println("Operation: " + operation.getResult(5.0, 2.0));
        System.out.print("Printer: ");
        printer.println("Printer test");
        System.out.println("Factorial: " + factorial.getResult(5));
    }

}
