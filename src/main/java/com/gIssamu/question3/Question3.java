package com.gIssamu.question3;

import java.util.Scanner;

public class Question3 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a String to encrypt: ");
        String string = sc.nextLine();

        String result = Encryptor.ecrypStrings(string);

        System.out.println("Result:");
        System.out.println(result);
    }

}
