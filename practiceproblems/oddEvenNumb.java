package com.company.practiceproblems;
import java.util.ArrayList;
import java.util.List;

public class oddEvenNumb {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(3);
            list.add(2);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            System.out.println(list);

            List<Integer> evenList = list.stream().filter(i->i%2==0).toList();
            System.out.println("Even List are here"+evenList);

            List<Integer> oddList = list.stream().filter(i->i%2!=0).toList();
            System.out.println("Even List are here"+oddList);
        }
    }



