package com.oneJava.lesson24.gInterface.demo;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo_3 {
    public static <T, U> Function<T, U> ternaryOperatorFirst(
        Predicate<? super T> condition,
        Function<? super T, ? extends U> ifTrue,
        Function<? super T, ? extends U> ifFalse) {

        return value -> condition.test(value) ? ifTrue.apply(value) : ifFalse.apply(value);
    }

    public static <T, U> Function<T, U> ternaryOperatorSecond(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        Function <T,U> func= (T arg) -> {
            if (condition.test(arg)) {
                return ifTrue.apply(arg);
            }
            else {
                return ifFalse.apply(arg);
            }
        };
        return func;

    }
}
