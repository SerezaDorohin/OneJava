package com.oneJava.lesson23.split;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).contains("-")) {
                System.out.println(input.split(" ")[0] + ":");
                input = input.substring(i + 2);
                for(int l = 0; l < input.split(",").length; l++) {
                    System.out.println("-" + input.split(", ")[l]);
                }
            }
        }
    }
}
