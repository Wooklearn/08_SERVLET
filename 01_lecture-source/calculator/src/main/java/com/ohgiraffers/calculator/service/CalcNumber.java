package com.ohgiraffers.calculator.service;

public class CalcNumber {



    public double calc(double number1, double number2, String operator) {

        // 계산 수행
        double result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }

        return result;
    }
}
