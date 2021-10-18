package com.company.day1;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("Enter an Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        String result = (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) ? "it is leep year" : "not leap year";
        System.out.println("\n" + result);



    }
}
