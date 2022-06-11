package com.max.idea;

import java.util.Scanner;

public class SimpleEquation {

    public static void main(String[] args) {

        System.out.print("Введите уравнение длиной из 5-ти символов: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int result = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                sum++;
            }
        }
        if (!(str.length() == 5) | !(sum == 1)) {
            System.out.println("Неверный формат ввода");
        } else if (str.charAt(3) == '=') {
            if (str.endsWith("x")) {
                if (str.charAt(1) == '+') {
                    result = Character.getNumericValue(str.charAt(0)) + Character.getNumericValue(str.charAt(2));
                } else if (str.charAt(1) == '-') {
                    result = Character.getNumericValue(str.charAt(0)) - Character.getNumericValue(str.charAt(2));
                } else {
                    System.out.println("Неверный формат ввода");
                    return;
                }
            } else if (str.startsWith("x")) {
                if (str.charAt(1) == '+') {
                    result = Character.getNumericValue(str.charAt(4)) - Character.getNumericValue(str.charAt(2));
                } else if (str.charAt(1) == '-') {
                    result = Character.getNumericValue(str.charAt(4)) + Character.getNumericValue(str.charAt(2));
                } else {
                    System.out.println("Неверный формат ввода");
                    return;
                }
            } else {
                if (str.charAt(2) == 'x') {
                    if (str.charAt(1) == '+') {
                        result = Character.getNumericValue(str.charAt(4)) - Character.getNumericValue(str.charAt(0));
                    } else if (str.charAt(1) == '-') {
                        result = Character.getNumericValue(str.charAt(0)) - Character.getNumericValue(str.charAt(4));
                    } else {
                        System.out.println("Неверный формат ввода");
                        return;
                    }
                }
            }
            System.out.print("Вывод: " + result);
        } else {
            System.out.println("Неверный формат ввода");
        }
    }
}
