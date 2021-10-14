package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner s = new Scanner(System.in);
        String a = new String(s.nextLine());
        System.out.println("Введите второе число");
        int b = s.nextInt();
        int i = Integer.parseInt (a);
        if (b > i) {
            System.out.println("Наибольшее число " + b);
            double y = i;
            System.out.println("Наименьшее число " + y);

        }
        else if (b < i) {
            System.out.println("Наибольшее число " + i);
            double y = b;
            System.out.println("Наименьшее число " + y);
        }
        else {
            System.out.println("Числа равны");
        }





    }
}
