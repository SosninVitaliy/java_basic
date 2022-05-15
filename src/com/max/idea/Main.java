package com.max.idea;

import java.net.SocketOption;
import java.util.Arrays;

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
    }
}
