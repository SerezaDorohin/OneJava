package com.oneJava.lesson24.homework.funcInterface;

import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Operation<Integer> addition = (v1, v2) -> v1 + v2;
        System.out.println(addition.getValue(2, 7));

        Operation<String> concatenation = (v1, v2) -> v1 + v2;
        System.out.println(concatenation.getValue("1", "d"));

        // Predicate:
        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(0));

        // Consumer:
        Consumer<String> printer = System.out::println;
        printer.accept("consumer test");

        // Function:
        Function<Integer, Double> converter = value -> Double.valueOf(value);
        System.out.println(converter.apply(1));

        // Supplier:
        Supplier<String> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text: ");
            return scanner.nextLine();
        };
        System.out.println("Entered text: " + text.get());

        // UnaryOperator:
        UnaryOperator<Double> sqrt = value -> Math.sqrt(value);
        System.out.println(sqrt.apply(4.0));

        // BinaryOperator:
        BinaryOperator<Double> pow = (v1, v2) -> Math.pow(v1, v2);
        System.out.println(pow.apply(2.0, 2.0));
    }

}
