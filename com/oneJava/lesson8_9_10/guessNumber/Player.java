package com.oneJava.lesson8_9_10.guessNumber;

public class Player {
    private String name;
    private int number;
    private int[] mas;

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
