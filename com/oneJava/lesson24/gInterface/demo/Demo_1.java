package com.oneJava.lesson24.gInterface.demo;

import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class Demo_1 {
    private int counter;

    public void foo() {}
    IntUnaryOperator sqare = x -> x * x;

    IntSupplier sequence = () -> counter++;

    int bonus = 10;
    IntUnaryOperator bonusAdder = (x) -> x + bonus;
}
