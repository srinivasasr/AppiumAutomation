package com.srini;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) throws Exception {
        int n=0;
        int b=0;
        double j=0;
        while(b!=-1){

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             b = Integer.parseInt(br.readLine());
             if(b==-1) break;
            j += b;
n++;
        }
        double k = j/n;
        System.out.println(k);
    }
}
