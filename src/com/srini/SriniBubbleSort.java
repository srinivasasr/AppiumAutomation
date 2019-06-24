package com.srini;

import java.util.Arrays;

public class SriniBubbleSort {
    public static void main(String[] args) {


        int[] arr = {6, 23, 7, 3,43,21,67,45,23,62,234,3,56,67};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
