package com.oneJava.lesson23.lexicography;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        if(encryptSymbol(input1.charAt(0)) < encryptSymbol(input2.charAt(0))) {
            System.out.println(input1);
        } else {
            System.out.println(input2);
        }

    }

    private static int resultSymbol;
    private static String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private static int encryptSymbol(char symbolChar) {
        String symbol = String.valueOf(symbolChar);
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i].toUpperCase().contains(symbol.toUpperCase())) {
                resultSymbol = i + 1;
                break;
            }
        }
        return resultSymbol;
    }
}
