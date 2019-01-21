package com.oneJava.lesson20.exchangeMoney;

/**
 * @author SergeyDorohin;
 * @version 1.2;
 * @task Избавиться от переменной indexOfCoin;
 * @type Домашняя работа;
 */

public class ExchangeMoney {
    private static int[] COINS_NOM = {1, 5, 10, 25, 50};
    public static int getCountOfWays(int money) {
        return getCountOfWays(money, 4);
    }
    private static int getCountOfWays(int money, int indexOfCoin) {
        if(!(money > 0)) {
            return 0;
        }
        if (money < 0 || indexOfCoin < 0) return 0;
        if (money == 0 || indexOfCoin == 0) return 1;
        return getCountOfWays(money, indexOfCoin - 1) + getCountOfWays(money - COINS_NOM[indexOfCoin], indexOfCoin);
    }
}