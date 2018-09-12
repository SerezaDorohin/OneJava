package com.oneJava.lesson8_9_10.guessNumber;

import java.util.Scanner;
/*Задача: добавить функционал в данный код.
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
        System.out.println("У вас 10 попыток!");
        System.out.print("Первый игрок вводит имя: ");
        Player playerOne = new Player(sc.next());
        System.out.print("Второй игрок вводит имя: ");
        Player playerTwo = new Player(sc.next());
        return new Player[]{playerOne, playerTwo};
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
