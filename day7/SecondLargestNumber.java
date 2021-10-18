package com.company.day7;
import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] arr = {1,5,9,3,2};
        Arrays.sort(arr);
        System.out.println("secondLargestNumber is --> "+ arr[arr.length-2]);

    }
}
