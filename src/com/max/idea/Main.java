package com.max.idea;


import java.net.SocketOption;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//      Переменная типа с плавающей точкой с наибольшим диапазоном чисел. Присвоено произвольное дробное значение
        double d = 75457.34;
//      Переменная целочисленного типа с наименьшим диапазоном чисел. Присвоено наибольшее возможное значение
        byte b = 127;
        System.out.println(d);
        System.out.println(b);

//      Массив из 5 любых целых чисел
        int[] nums = {1, 10, 50, 100, 200};
//      Первый и последний элемент в массиве поменялись
        int first = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = first;
        System.out.println(nums[0]);
        System.out.println(nums[nums.length - 1]);

//      Вывод в консоль результата суммы первого и среднего элемента
        int sum = nums[0] + nums[nums.length / 2 ];
        System.out.println(sum);

//      Задача №4_Операторы
        Scanner in = new Scanner(System.in);

//      Ввести три числа с клавиатуры x,y,z
        System.out.println("Input x: ");
        double x = in.nextInt();

        System.out.println("Input y: ");
        double y = in.nextInt();

        System.out.println("Input z: ");
        double z = in.nextInt();

//      Вывести в консоль среднее арифметическое чисел
        double arithmeticMean = (x + y + z) / 3;
        System.out.println(arithmeticMean);

//      Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        int arithmeticMeanRounding = (int)Math.floor(arithmeticMean / 2);
//      Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (arithmeticMeanRounding > 3) {
            System.out.println("Программа выполнена корректно");
        }
        System.out.println(arithmeticMeanRounding);
    }
}
