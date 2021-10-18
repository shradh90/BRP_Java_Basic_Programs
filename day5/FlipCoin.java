package com.company.day5;
import com.company.Utility;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int numberOfTimesFlipCount;
        Utility utility = new Utility();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to flip coin");
        numberOfTimesFlipCount = scanner.nextInt();
        if(numberOfTimesFlipCount>0) {
            utility.flipCoin(numberOfTimesFlipCount);
        }else {
            System.out.println("Please enter positive integer");
        }
        scanner.close();
    }
}
