package com.oneJava.lesson24.gInterface.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Demo_2 {
    ToIntFunction<String> intParser =
            Integer::parseInt;

    Consumer<Object> printer =
            System.out::println;

    Function<Object, String> objectToString =
            Object::toString;

    IntFunction<String[]> arrayAllocator =
            String[]::new;
}
