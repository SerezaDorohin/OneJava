package com.oneJava.lesson20.exchangeMoney;

public class Test {
    public static void main(String[] args) {
        System.out.println("coins: 1, 2, 5, 10, 20, 40.");
        System.out.println("money: " + 1 + ", answer: " + ExchangeMoney.getCountOfWays(1) + ".");
        System.out.println("money: " + 2 + ", answer: " + ExchangeMoney.getCountOfWays(2) + ".");
        System.out.println("money: " + 5 + ", answer: " + ExchangeMoney.getCountOfWays(5) + ".");
        System.out.println("money: " + 100 + ", answer: " + ExchangeMoney.getCountOfWays(100) + ".");
    }
}
