package converter;

import java.util.Scanner;

public class Converter {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        int weight;
//        int distance;
//
//        int gram;
//        int kg;
//        int ton;
//        int lb;
//
//        int meter;
//        int mile;
//        int yard;
//        int foot;

        int PhysicalQuantity = getPhysicalQuantity();
        int UnitMass = 0;
        int UnitDistance = 0;
        if(PhysicalQuantity == 1){
            UnitMass = getUnitMass();
        }else{
            UnitDistance = getUnitDistance();
        }
        int Result = getResult();
        String result = calc(PhysicalQuantity, UnitMass, UnitDistance, Result);
        System.out.println("Результат: " + result);
        in.close();
    }

    public static int getPhysicalQuantity(){
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int num = in.nextInt();
        if(num != 1 & num != 2){
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            num = getPhysicalQuantity();
        }
        return num;
    }

    public static int getUnitDistance(){
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int num = in.nextInt();
        if(num != 1 ^ num != 2 ^ num != 3 ^ num != 4 ^ num != 5) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            num = getUnitMass();
        }
        return num;
    }

    public static int getUnitMass(){
        System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - тонна, 4 - фунт");
        int num = in.nextInt();
        if(num != 1 & num != 2 & num != 3 & num != 4 & num != 5) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            num = getUnitMass();
        }
        return num;
    }

    public static int getResult(){
        System.out.println("Введите число");
        int num;
        if(in.hasNextInt()){
            num = in.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            num = getResult();
        }
        return num;
    }
    public static String calc(int num1, int num2, int num3, double num4) {
        String result;
        if (num1 == 1) {
            switch (num2){
                case 1:
                    result = "\nГраммы: " + num4 + "\nКилограммы: " + num4 / 1000 + "\nТонны: " + num4 / 1e+6 +
                            "\nФунты: " + num4 / 454;
                    break;
                case 2:
                    result = "\nКилограммы: " + num4 + "\nГраммы: " + num4 * 1000 + "\nТонны: " + num4 / 1000 +
                            "\nФунты: " + num4 * 2.205;
                    break;
                case 3:
                    result = "\nТонны: " + num4 + "\nГраммы: " + num4 / 1e+6 + "\nКилограммы: " + num4 / 1000 +
                            "\nФунты: " + num4 * 2205;
                    break;
                case 4:
                    result = "\nФунты: " + num4 + "\nГраммы: " + num4 * 454 + "\nКилограммы: " + num4 / 2.205 +
                            "\nТонны: " + num4 / 2205;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, num3, num4);//рекурсия
            }
        }else {
            switch (num3){
                case 1:
                    result = "\nМетры: " + num4 + "\nМили: " + num4 / 1609 + "\nЯрды: " + num4 * 1.094 +
                            "\nФуты: " + num4 * 3.281;
                    break;
                case 2:
                    result = "\nМили: " + num4 + "\nМетры: " + num4 * 1609 + "\nЯрды: " + num4 * 1760 +
                            "\nФуты: " + num4 * 5280;
                    break;
                case 3:
                    result = "\nЯрды: " + num4 + "\nМетры: " + num4 / 1.094 + "\nМили: " + num4 / 1760 +
                            "\nФуты: " + num4 * 3;
                    break;
                case 4:
                    result = "\nФуты: " + num4 + "\nМетры: " + num4 / 3.281 + "\nЯрды: " + num4 / 3 +
                            "\nМили: " + num4 / 5280;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(num1, num2, num3, num4);//рекурсия
            }
        }
        return result;
    }
}
