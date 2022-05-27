package com.max.idea;

import java.util.Scanner;

class SumNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int sum = 0;
        do {
            System.out.println("Введите любое целое положительное число: ");
            while (!input.hasNextInt()) {
                System.out.println("Это не число!");
                input.next();
            }
            num = input.nextInt();
        } while (num <= 0);
            for (int i = 0; i <= num; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println("Сумма нечетных цифр до введенного пользователем числа n: " + sum);
        input.close();
    }
}
