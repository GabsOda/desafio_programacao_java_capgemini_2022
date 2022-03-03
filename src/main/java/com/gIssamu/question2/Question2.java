package com.gIssamu.question2;

import java.util.Scanner;

public class Question2 {
    private static final Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        
        System.out.println("Enter the amount of values: ");
        int amount = sc.nextInt(); 

        System.out.println("Enter the array values: ");
        int[] arr = new int[amount]; 

        for(int i = 0; i < amount; i++) {
            arr[i] = sc.nextInt(); 
        }

        System.out.println("Enter difference value: ");
        int diff = sc.nextInt(); 

        int result = Counter.counterRun(diff, arr); 

        System.out.println("Result");
        System.out.println(result);
        
    }

}
