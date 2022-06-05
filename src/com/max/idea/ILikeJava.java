package com.max.idea;

public class ILikeJava {

    static String str = "I like Java!!!";
    static String result;

    public static void main(String[] args) {


//      Проверить, содержит ли строка подстроку “Java” (использовать contains())
        boolean got1 = str.contains("Java");

//      Проверить, начинается ли строка с подстроки “I like” (использовать startsWith())
        boolean got2 = str.startsWith("I like");

//      Проверить, заканчивается ли строка с подставки “!!!” (использовать endsWith())
        boolean got3 = str.endsWith("!!!");

//      Если 3 предыдущих условия верны, вывести данную строку, преобразованную к верхнему регистру
        if (got1 & got2 & got3) {
            String toUpperCase = str.toUpperCase();
            System.out.println(toUpperCase);
        }
//      Заменить все символы ‘a’ на ‘о’ и вывести подстроку “Jovo” на экран (использовать substring()).
        String chg = str.replace('a', 'o');
        result = chg.substring(7, 11);
        System.out.println(result);
    }
}
