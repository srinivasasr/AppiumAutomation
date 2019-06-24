package com.srini;

import java.util.Scanner;

public class RevInteger {

    public static void main(String[] args) {

int a=1234;
int r=0;
        while(a!=0){
            r= (r*10)+a%10;
            a=a/10;
        }
System.out.println(r);
    }
    }
