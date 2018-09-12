package com.oneJava.lesson2_3_4.calculator;

import static java.lang.Math.*;


public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void consider() {
        switch (sign) {
            case "-":
                System.out.println(subtractExact(firstNumber, secondNumber));
                break;
            case "+":
                System.out.println(addExact(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(multiplyExact(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println(floorDiv(firstNumber, secondNumber));
                break;
            case "^":
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            case "%":
                System.out.println(floorMod(firstNumber, secondNumber));
                break;
        }
    }
}



