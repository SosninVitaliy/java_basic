package com.max.idea;

import java.util.Random;

public class ArrayRandom {

    static double[] array = new double[15];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = ((double) 20 + (random.nextDouble() * (-20 - 20)));
        }
        double max, min;
        min = max = array[0];
        for (double v : array) {
            if (v > max) {
                max = v;
            } else if (v < min) {
                min = v;
            }
        }
        System.out.println("Максимальный элемент : " + max);
        System.out.println("Минимальный элемент : " + min);
        System.out.println("Максимальный элемент по модулю из минимального и максимального элементов: " + (Math.max(Math.abs(max), Math.abs(min))));
    }
}
