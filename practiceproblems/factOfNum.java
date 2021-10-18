package com.company.practiceproblems;
import java.util.Scanner;
public class factOfNum {
        static void checkFactorial(int num) {
            int fact = 1;
            for(int i = 1; i<=num; i++) {
                fact = fact*i;
            }
            System.out.println("factorial of the " +num+ " is "+fact);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            sc.close();
            checkFactorial(num);
        }

}
