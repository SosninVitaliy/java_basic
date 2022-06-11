package com.max.idea;

import java.util.Scanner;

public class MaximumNumberOfCharacters {

    public static void main(String[] args) {
        int quantity;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите количество строк: ");
            while (!in.hasNextInt()) {
                System.out.println("Это не число!");
                in.next();
            }
            quantity = in.nextInt();
        } while (quantity <= 0);
        String[] strings = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strings[i] = in.next();
        }
        int z = 0;
        long max = strings[0].chars().distinct().count();
        for (int i = 0; i < quantity; i++) {
            if (max < strings[i].chars().distinct().count()){
                max = strings[i].chars().distinct().count();
                z = i;
            }
        }
        System.out.print("Ответ: " + strings[z]);
        in.close();
    }
}
