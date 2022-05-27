package com.max.idea;

import java.util.Scanner;

public class ArithmeticMean {

    static Scanner input = new Scanner(System.in); // Объявляем Scanner
    static Scanner in = new Scanner(System.in); // Объявляем Scanner
    static double[] array = new double[0];

    public static void main(String[] args) {
        int size;
        do {
            System.out.println("Введите размер массива (целое положительное число): ");
            while (!input.hasNextInt()) {
                System.out.println("Это не число!");
                input.next();
            }
            size = input.nextInt();// Читаем с клавиатуры размер массива и записываем в size

        } while (size <= 0);
        array = new double[size]; // Создаём массив int размером в size
        System.out.println("Введите данные для массива типа double:");
        for (int i = 0; i < size; i++) {
            if (in.hasNextDouble()) {
                array[i] = in.nextDouble(); // Заполняем массив элементами, введёнными с клавиатуры
            }else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                in.next();
            }
        }
        double sum = 0;
        // Считаем сумму элементов массива
        for (double v : array) {
            sum += v;
        }
        double arithmeticMean = sum / array.length; // Считаем среднее арифметическое всех чисел массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * arithmeticMean + " - произведение элемента массива и среднего арифметического числа массива. " + i + " инндекс элемента массива");
        }
        input.close();
        in.close();
    }
}
