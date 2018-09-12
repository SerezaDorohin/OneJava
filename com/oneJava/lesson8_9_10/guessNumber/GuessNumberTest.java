package com.oneJava.lesson8_9_10.guessNumber;

import java.util.Scanner;
/*Задача: добавить функционал в данный код.
V 2.1:
-> Система ввода имени изменена.
-> Уменьшено кол-во кода.
V 2.0:
-> Убраны некоторые неполадки, баги.
-> Главный класс разгружен.
-> Переработана система выхода для экономии места.
V 1.0:
-> Программа модифицирована.
* */
public class GuessNumberTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Player[] players = getPlayer();
        GuessNumber guessNumber = new GuessNumber(players[0], players[1]);
        while (true) {
            guessNumber.play();
            testEnd();
        }
    }

    public static Player[] getPlayer() {
        System.out.print("Введите ваши имена через пробел[имя_игрока_1 <ПРОБЕЛ> имя_игрока_2]: ");
        return new Player[]{new Player(sc.next()),new Player(sc.next())};
    }

    public static void testEnd() {
        while (true) {
            System.out.print("Хотите продолжить?[да/нет]: ");
            String userAnswer = sc.next();
            if ("да".equals(userAnswer))break;
            if ("нет".equals(userAnswer))System.exit(0);
        }
    }
}
