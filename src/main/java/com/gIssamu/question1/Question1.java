package com.gIssamu.question1;

import java.util.Scanner;

public class Question1 {
    private static final Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {

        System.out.println("Enter the amount of values (just odd): ");
        int amount = sc.nextInt(); 

        if (amount % 3 != 0){
            throw new RuntimeException("The amount must be odd!"); 
        }

        System.out.println("Enter the values: "); 
        int[] arr = new int[amount]; 

        for(int i = 0; i < amount; i++) {
            arr[i] = sc.nextInt(); 
        }

        int result = Median.median(arr); 

        System.out.println("Result:");
        System.out.println(result);;

    }

}
