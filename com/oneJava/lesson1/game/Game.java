package com.oneJava.lesson1.game;

public class Game {
    public static void main(String[] args) {
        int num = 32;//число компьютера
        int usersNumber = 46;//Число пользователя
        while (true) {
            if (usersNumber == num) {
                System.out.println("You Win!");
                break;
            } else if (usersNumber < num) {
                System.out.println("Your num is less");
                usersNumber++;
            } else if (usersNumber > num) {
                System.out.println("Your num is more");
                usersNumber--;
            }
        }
    }
}