package com.max.idea;

import java.util.Scanner;

public class Matrix {

    static Scanner input = new Scanner(System.in); // Объявляем Scanner
    static int[][] array = new int[0][0];

    public static void main(String[] args) {
        int sizeLine;
        int sizeColumn = 0;

        do {
            System.out.println("Введите размер строки массива (целое положительное число): ");
            while (!input.hasNextInt()) {
                System.out.println("Это не число!");
                input.next();
            }
            sizeLine = input.nextInt();// Читаем с клавиатуры размер массива и записываем в sizeLine

        } while (sizeLine <= 0);
        array = new int[sizeLine][sizeColumn]; // Создаём массив int размером в sizeLine

        do {
            System.out.println("Введите размер столбца массива (целое положительное число): ");
            while (!input.hasNextInt()) {
                System.out.println("Это не число!");
                input.next();
            }
            sizeColumn = input.nextInt();// Читаем с клавиатуры размер массива и записываем в sizeColumn

        } while (sizeColumn <= 0);
        array = new int[sizeLine][sizeColumn]; // Создаём массив int размером в sizeColumn
//        System.out.println("Количество строк массива: " + array.length);
//        System.out.println("Количество столбцов массива: " + array[0].length);

        for (int i = 0; i < sizeLine; i++) {
            System.out.println("Введите данные для " + i + " индекса массива строки:");
            if (input.hasNextInt()) {
                array[i][0] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                break;
            }
            for (int j = 0; j < sizeColumn; j++) {
                System.out.println("Введите данные для " + j + " индекса массива столбца:");
                if (input.hasNextInt()) {
                    array[i][j] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
                } else {
                    System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                    break;
                }
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            int num = array[0][i] * 3;
            System.out.println(array[0][i] + " - элемент массива из первой строки матрицы умножается на 3. Итог: " + num);
        }
        input.close();
    }
}
