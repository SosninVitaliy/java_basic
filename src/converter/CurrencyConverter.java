package converter;

import java.util.Scanner;

public class CurrencyConverter {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double bucks;
        do {
            System.out.println("Введите текущий курс доллара: ");
            while (!in.hasNextDouble()) {
                System.out.println("Это не число!");
                in.next();
            }
            bucks = in.nextDouble();
        } while (bucks <= 0);
        double rub;
        do {
            System.out.println("Введите количество рублей: ");
            while (!in.hasNextDouble()) {
                System.out.println("Это не число!");
                in.next();
            }
            rub = in.nextDouble();
        } while (rub <= 0);
        System.out.println("Итого: " + String.format("%.2f", rub/bucks) + " долларов");
    }
}
