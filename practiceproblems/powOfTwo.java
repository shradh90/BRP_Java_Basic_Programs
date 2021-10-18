package com.company.practiceproblems;

import java.util.Scanner;

public class powOfTwo {
    public static void main(String[] args){
        System.out.println(" n =  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (powerOfTwo(n)){
            System.out.println(" True ");
        }
        else {
            System.out.println(" false ");
        }

        }

        public static  boolean powerOfTwo(int n)
        {
            while(n%2==0)
            {
                n=n/2;
            }
            if(n==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }


    }




