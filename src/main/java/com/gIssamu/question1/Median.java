package com.gIssamu.question1;

import java.util.Arrays;

public class Median {
    
    public static int median(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length/ 2]; 

    }
}
