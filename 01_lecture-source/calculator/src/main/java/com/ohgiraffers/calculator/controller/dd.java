package com.ohgiraffers.calculator.controller;

public class dd {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++ ) {

            System.out.println("======" + i + "단" + "======");

            for (int j = 1; j <= 9; j++) {

                int result = i * j;

                System.out.println(i + " x " + j + " = " + result);

            }
        }
    }
}