package com.srini;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.text.*;

public class Circle {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        for(int i=0;i<=n-1;i++){

            int num = Integer.parseInt(br.readLine());
            arr[i]=num;
        }
        Arrays.sort(arr);
        int max = arr[n-1];
        System.out.println(max);
    }
}
