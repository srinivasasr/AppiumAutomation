package com.srini;

import java.util.Scanner;

public class PrimeNumber {
    public static void isPrime(int num){
        if(num<=1){
            System.out.println("NO");
        }else if(num>=2&& num%2==0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        PrimeNumber.isPrime(k);
    }
}
