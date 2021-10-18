package com.company.day1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintThreeNames {

        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList();
            System.out.println("Enter Name : ");
            String personOne = new Scanner(System.in).next();
            String personTwo = new Scanner(System.in).next();
            String personThree = new Scanner(System.in).next();
            names.add(personThree);
            names.add(personTwo);
            names.add(personOne);
            for (Object name : names) {
                System.out.print("Hi, " +name+ " " );
                System.out.println(". How are you?");
            }

        }
    }

