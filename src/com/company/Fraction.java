package com.company;

public class Fraction {
    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
        if (denominator < 0) {
            this.numerator *= -1;
        }
//        this.denominator = denominator<0 ?
//                -denominator:
//                denominator;
        this.denominator = Math.abs(denominator);
    }

    //    public Fraction multiply(Fraction f1){
//        numerator = numerator*f1.numerator;
//        denominator= denominator* f1.denominator;
//        return f1;
    public static Fraction multiply(Fraction f1, Fraction f2) {
        Fraction result = new Fraction(f1.numerator * f2.numerator,
                f1.denominator * f2.denominator);
        long limit = Math.min(result.numerator, result.denominator);

        for (long i = 2; i <= limit; i++) {
            if (result.numerator % i == 0 && result.denominator % i == 0) {
                result.numerator/= i;
                result.denominator /= i;
            }
        }

        return result;
    }

    public static Fraction addition(Fraction f1, Fraction f2) {
        Fraction result = new Fraction(f1.numerator * f2.denominator + f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
        long limit = Math.min(result.numerator, result.denominator);

        for (long i = 2; i <= limit; i++) {
            if (result.numerator % i == 0 && result.denominator % i == 0) {
                result.numerator/= i;
                result.denominator /= i;
            }
        }

        return result;
    }

    public static Fraction division(Fraction f1, Fraction f2) {
        Fraction result = new Fraction(f1.numerator * f2.denominator,
                f1.denominator * f2.numerator);
        long limit = Math.min(result.numerator, result.denominator);

        for (long i = 2; i <= limit; i++) {
            if (result.numerator % i == 0 && result.denominator % i == 0) {
                result.numerator/= i;
                result.denominator /= i;
            }
        }

        return result;
    }

    public static Fraction subtraction(Fraction f1, Fraction f2) {
        Fraction result = new Fraction(f1.numerator * f2.denominator - f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
        for (int i = 1; i < result.numerator; i++) {
            if (result.numerator % i == 0 && result.denominator % i == 0) {
                result.numerator /= i;
                result.denominator /= i;
            }
            while (result.numerator % 2 == 0 && result.denominator % 2 == 0) {
                result.numerator /= 2;
                result.denominator /= 2;
            }


        }
        return result;
    }
}
