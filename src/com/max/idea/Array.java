package com.max.idea;

import java.util.Scanner;

public class Array {

    static Scanner input = new Scanner(System.in); // Объявляем Scanner

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 7;
        System.out.println("Введите размер массива: ");
        int size = 0;
        int[] array = new int[0];
        if (input.hasNextInt()) {
            size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
            array = new int[size]; // Создаём массив int размером в size
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Введите данные для массива:");
            if (input.hasNextInt()) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                break;
            }
        }
        for(int i = 0; i < size; i++){
            if (array[i] == x | array[i] == y | array[i] == z) {
                System.out.println(array[i] + ": Данное значение имеется в константах");
            }
        }
        input.close();
    }
}