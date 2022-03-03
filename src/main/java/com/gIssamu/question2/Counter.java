package com.gIssamu.question2;

public class Counter{
    
    public static int counterRun(int x, int[] n) {
        int count = 0;

        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                if (n[i] - n[j] == x) {
                    count++; 
                }
            }
        }

        return count; 
    }

}