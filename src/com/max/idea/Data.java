package com.max.idea;


import java.util.Scanner;

public class Data {

    static Scanner input = new Scanner(System.in); // Объявляем Scanner
    static Integer number1;
    static String result;
    static int number2;

    public static void main(String[] args) {

//      Ввести число с клавиатуры
        do {
            System.out.println("Введите целое положительное число: ");
            while (!input.hasNextInt()) {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                input.next();
            }
            number1 = input.nextInt();
        } while (number1 <= 0);

//      Записываем число в строковую переменную
        result = number1.toString();

//      Ввести число с клавиатуры
        do {
            System.out.println("Введите целое положительное число: ");
            while (!input.hasNextInt()) {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                input.next();
            }
            number2 = input.nextInt();
        } while (number2 <= 0);

//      Сравниваем два числа
        if (number1 == number2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Это число больше: " + Math.max(number1, number2));
            int min = Math.min(number1, number2);
            System.out.println("Наименьшее число " + (double) min);
        }

        input.close();
    }
}
