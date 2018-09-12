package com.oneJava.lesson8_9.guessNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int thoughtNumber;
    private Scanner sc = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    public int attempts = 0;
    public int convertedAttempts = 10;

    public void play() {
        str.replace(0,str.length(),"");
        thoughtNumber = (int) (Math.random() * 100);
        System.out.println("Подсказка, число загаданное компьютером равно " + thoughtNumber);
        setMasNullForAll(new Player[]{playerOne, playerTwo});
        while (true) {
            System.out.println("Отсалось " + convertedAttempts + " попыток!" + ((convertedAttempts < 4) == true ? " Поторопитесь!!" : " У вас еще есть время!"));
            if (checkAttempts(attempts) == false) {
                System.out.println("У вас закончились попытки!\nВаши попытки:");
                System.out.println("-----------------\n" + playerOne.getName() + ":" + Arrays.toString(playerOne.getMas()) + "\n"
                        + playerTwo.getName() + ":" + Arrays.toString(playerTwo.getMas()) + "\n----------------------");
                setMasNullForAll(new Player[]{playerOne, playerTwo});
                attempts = 0;
                convertedAttempts=10;
                break;
            }
            inputOfNumber(playerOne);
            inputOfNumber(playerTwo);
            setMasOfNumbers(new Player[]{playerOne, playerTwo}, attempts);
            int numberPlayerOne = check(playerOne, attempts);
            int numberPlayerTwo = check(playerTwo, attempts);
            if (numberPlayerOne == thoughtNumber && numberPlayerTwo == thoughtNumber) {
                attempts = 0;
                convertedAttempts = 10;
                break;
            } else if (numberPlayerOne == thoughtNumber || numberPlayerTwo == thoughtNumber) {
                attempts = 0;
                convertedAttempts = 10;
                break;
            }
            attempts++;
            convertedAttempts--;
        }
    }

    public boolean checkAttempts(int attempts) {
        return attempts == 10 ? false : true;
    }

    public void setMasNullForAll(Player[] players) {
        for (Player player : players) {
            player.setMas(new int[]{0,0,0,0,0,0,0,0,0,0});
        }
    }

    public int[] mas;
    public String end = "";
    String[] nums;

    public void setMasOfNumbers(Player[] players, int lenght) {
        for (Player player : players) {
            int[] buffer = player.getMas();
            buffer[lenght] = player.getNumber();
            player.setMas(buffer);
        }
    }

    public String getAttempts(Player player, int attempts) {
        return Arrays.toString(Arrays.copyOf(player.getMas(), attempts));
    }

    public StringBuilder str = new StringBuilder();

    public String getArrayOfAttemptsToOut(Player player) {
        str.append("( | ");
        int[] array = player.getMas();
        for (int anArray : array) {
            if (anArray != 0) {
                str.append(anArray + " | ");
            }
        }
        str.append(")");
        return str.toString();
    }

    public void inputOfNumber(Player player) {
        try {
            System.out.print(player.getName() + " вводит число: ");
            player.setNumber(sc.nextInt());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Вводите числа!");
            System.exit(10101);
        }
    }

    public int check(Player player, int attempts) {
        int number = player.getNumber();
        String name = player.getName();
        if (number == thoughtNumber) {
            System.out.println("\n-------------------\n" + name + ", вы угадали c " + attempts + " попытки! Ваши попытки:\n" + getArrayOfAttemptsToOut(player) + "\n---------------------\n");
        } else if (number > thoughtNumber) {
            System.out.println(name + ", вы ввели число больше, чем которое загадал компьютер");
        } else if (number < thoughtNumber) {
            System.out.println(name + ", вы ввели число меньше, чем которое загадал компьютер");
        }
        return number;
    }
}
