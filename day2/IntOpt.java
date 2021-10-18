package com.company.day2;
import com.company.Utility;

import java.util.Scanner;
public class IntOpt {
    public static void main(String[] args) {


        int a, b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vale : ");
        a = sc.nextInt();
        System.out.println("Enter b value : ");
        b=sc.nextInt();
        System.out.println("Enter c value : ");
        c=sc.nextInt();

        Utility.mathOpt(a, b, c);

    }
}
