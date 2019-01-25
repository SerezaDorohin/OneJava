package com.oneJava.lesson20.exchangeMoney;

/**
 * @author SergeyDorohin;
 * @version 1.3(working version);
 * @task Избавиться от переменной indexOfCoin;
 */

/*
 * В задаче использовал иные номиналы монет: 1, 2, 5, 10, 20, 40. (40 / 2 -> 20 / 2 -> 10 / 2 -> 5 / 2 -> 2 / 2 -> 1 - по такой логике)
 */

public class ExchangeMoney {
    public static int getCountOfWays(int money) {
        if(money <= 0) return 0;
        return getCountOfWays(money, 40);
    }
    private static int getCountOfWays(int money, int coin) {
        if (money < 0 || coin < 0) return 0;
        if (money == 0 || coin == 0) return 1;
        return getCountOfWays(money, coin / 2) + getCountOfWays(money - coin - 1, coin / 2);
    }
}