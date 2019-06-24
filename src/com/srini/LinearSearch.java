package com.srini;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arrey = {21, 60, 33, 14, 50, 16};
        int max = getMax(arrey);
        System.out.println(+max);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length - 1; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}
