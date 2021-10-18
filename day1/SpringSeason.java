package com.company.day1;
import com.company.Utility;

import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int month, day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Month here : ");
        month = sc.nextInt();
        System.out.println("Enter an Date here : ");
        day=sc.nextInt();

        Utility.monthDay(month, day);
    }

}
