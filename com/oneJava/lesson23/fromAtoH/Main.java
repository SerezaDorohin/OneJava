package com.oneJava.lesson23.fromAtoH;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++) {
            for(int n = 0; n < alphabet.length; n++) {
                String symbol = String.valueOf(words[i].charAt(0));
                if(symbol.contains(alphabet[n]) || symbol.contains(alphabet[n].toLowerCase())) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
