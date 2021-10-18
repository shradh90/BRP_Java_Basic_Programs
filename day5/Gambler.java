package com.company.day5;
import com.company.Utility;

import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utility utility=new Utility();
        int times, stake, goal;
        System.out.println("Enter stake");
        stake=scanner.nextInt();
        System.out.println("Enter goal");
        goal=scanner.nextInt();
        System.out.println("Enter number of times you want to play");
        times=scanner.nextInt();
        utility.gamlingSimulation(stake,goal,times);

        scanner.close();

    }
}
