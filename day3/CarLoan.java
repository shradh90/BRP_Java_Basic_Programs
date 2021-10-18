package com.company.day3;

public class CarLoan {
    public static void main(String[] args) {
        double principal = 200000;
        double years = 4;
        double rate = 3.0;

        double r = (rate / 100) / 12;   // monthly interest rate
        double n = 12 * years;          // number of months

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }
}
