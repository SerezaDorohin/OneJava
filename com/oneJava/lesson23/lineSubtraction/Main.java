package com.oneJava.lesson23.lineSubtraction;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StringBuilder stringBuilder = new StringBuilder();
    private static String[] symbolsStr1;
    private static String[] symbolsStr2;
    private static boolean repeat = false;
    private static StringBuilder end = new StringBuilder();

    public static void main(String[] args) {
        String firstStr = scanner.next();
        String secondStr = scanner.next();
        symbolsStr1 = firstStr.split("");
        symbolsStr2 = secondStr.split("");
        end.append(getRepeatLetters(symbolsStr1, symbolsStr2) + getRepeatLetters(symbolsStr2, symbolsStr1));
        System.out.println(end.toString());
    }

    private static String getRepeatLetters(String[] symbolsStr1, String[] symbolsStr2) {
        for(int i = 0; i < symbolsStr1.length; i++) {
            for(int n = 0; n < symbolsStr2.length; n++) {
                if((symbolsStr2[n].equals(symbolsStr1[i]))) {
                    repeat = false;
                    break;
                } else {
                    repeat = true;
                }
            }
            if(repeat == true) {
                stringBuilder.append(symbolsStr1[i]);
            }
        }
        return stringBuilder.toString();
    }
}