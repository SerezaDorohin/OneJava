package com.oneJava.lesson8_9.guessNumber;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userAnswer;
        System.out.println("У вас 10 попыток");
        System.out.print("Введите имя первого игрока: ");
        try {
            Player playerOne = new Player(sc.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(sc.next());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        do {
            guessNumber.play();
            while (true) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                userAnswer = sc.next();
                if (userAnswer.equals("да") || userAnswer.equals("нет")) {
                    break;
                }
            }
        }
        while (userAnswer.equals("да"));
        } catch (java.util.NoSuchElementException e){
            System.out.println("Не используйсте данне символы!");

        }
    }
}
