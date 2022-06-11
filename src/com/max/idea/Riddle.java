package com.max.idea;

import java.util.Scanner;

public class Riddle {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Вы имеете право на одну подсказку, при первой попытке. При этом 2 и 3 попытки уже будут недоступны. Просто введите слово: \"Подсказка\"");
        byte z = 1;
        do {
            System.out.print("Ответ: ");
            String str = in.nextLine();
            if (z == 1 & str.equalsIgnoreCase("Подсказка")) {
                help();
                break;
            } else if (z != 1 & str.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            } else if (!(str.equalsIgnoreCase("Заархивированный вирус"))) {
                if (z == 3) {
                    System.out.println("Обидно, приходи в другой раз");
                } else {
                    System.out.println("Подумай еще!");
                }
                z++;
            } else {
                System.out.println("Правильно!");
                z = 4;
            }
        } while (z < 4);
    }

    public static void help() {
        System.out.println("ОБМАНУЛ, нет у тебя подсказки");
        System.out.print("Ответ: ");
        String str = in.nextLine();
        if (!(str.equalsIgnoreCase("Заархивированный вирус"))) {
            System.out.println("Обидно, приходи в другой раз");
        } else {
            System.out.println("Правильно!");
        }
        in.close();
    }
}
