package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Fraction f1 = new Fraction(1,2);
//        Fraction f2 = new Fraction(3,4);
//        f1.multiply(f2);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите числитель первой дроби");
        int num = sc.nextInt();
        System.out.println("Введите знаменатель первой дроби");
        int denom = sc.nextInt();
        System.out.println("Введите числитель второй дроби");
        int num1 = sc1.nextInt();
        System.out.println("Введите знаменатель второй дроби");
        int denom1 = sc1.nextInt();
       Fraction f = new Fraction(num,denom);
       Fraction f2 = new Fraction( num1,denom1);
        Fraction f4 = Fraction.multiply(f, f2);

        Fraction f5 = Fraction.addition(f, f2);
        Fraction f6 = Fraction.division(f, f2);
        Fraction f7 = Fraction.subtraction(f, f2);
        System.out.print(f7);


    }
}


