package com.company.day5;

import java.util.Scanner;

import com.company.Utility;

public class PowOfTwo {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Power of Two : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Utility.powerOf(n);
    }
}
