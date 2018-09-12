package com.oneJava.lesson2_3_4.calculator;

import java.util.Scanner;
/*
* Создать калькулятор.
*/
public class CalculatorTest {
    static Scanner sc = new Scanner(System.in);
    static Calculator calculator = new Calculator();
    public static void main(String[] args) {
        while (true) {
            enteringExpressions();
            calculator.consider();
            System.out.print("Хотите продолжить? [да/нет]: ");
            if (proceed().equals("нет")) {
                System.exit(0);
            }
        }
    }

    public static String inputMathExpression(){
        System.out.print("Введите математическое выражение: ");
        return sc.nextLine();
    }

    public static String proceed(){
        String choice = sc.nextLine();
        while (!(choice.equals("нет") || choice.equals("да"))) {
            System.out.print("Вы ввели некорректный ответ. Поробуйте ещё раз [да/нет]: ");
            choice = sc.nextLine();
        }
        return choice;
    }

    public static void enteringExpressions() {
        String[] mathExpress = inputMathExpression().split(" ");
        int firstNumber = Integer.parseInt(mathExpress[0]);
        calculator.setFirstNumber(firstNumber);
        calculator.setSign(mathExpress[1]);
        int secondNumber = Integer.parseInt(mathExpress[2]);
        calculator.setSecondNumber(secondNumber);
    }
}