package com.oneJava.lesson2_3_4.game;

import java.util.Scanner;

/*
* Сделать программу для угадывания чисел с выводом всех попыток
*/

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("У вас 10 попыток ");
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player();
        playerOne.setName(sc.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player();
        playerTwo.setName(sc.next());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        while (true) {
            guessNumber.play();
            while (true) {
                System.out.print("Хотите продолжить?[да/нет]: ");
                String choise=sc.next();
                if ("да".equals(choise)){
                    break;
                }
                else if ("нет".equals(choise)){
                    System.exit(0);
                }
            }
        }
    }
}