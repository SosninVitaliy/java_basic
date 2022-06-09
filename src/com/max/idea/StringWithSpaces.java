package com.max.idea;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWithSpaces {

    static String str;

    public static void main(String[] args) {

//      Вывести слова, состоящие только из латиницы
        System.out.println("Выведите строку: ");
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        String str = input.nextLine();
        String[] strArray = str.split(" ");
        byte b = 0;
        for (String s : strArray) {
            Pattern p = Pattern.compile("\\b[A-Za-z]+\\b");
            Matcher matcher = p.matcher(s);
            if (matcher.find()) {
                System.out.println(s);
                b++;
            }
        }
        System.out.println("Количество слов на латиницы: " + b);
    }
}
