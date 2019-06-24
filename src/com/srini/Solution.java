package com.srini;

import javafx.beans.binding.ObjectExpression;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Solution {

    public static void main(String[] args) {


   int [] s = {100,100,50,40,40,20,10};
   int [] a = {5,25,50,120};

        int[] rank = new int[s.length];
        rank[0] = 1;
        for(int i=1;i<s.length;i++){
            if(s[i] < s[i-1]){
                rank[i] = rank[i-1] + 1;
            }else{
                rank[i] = rank[i-1];
            }
        }
        int k=s.length-1;
        for(int i=0;i<a.length;i++){

            while(k>=0 && a[i] >= s[k])
                k--;

            if(k >= 0)
                System.out.println(rank[k]+1);
            else
                System.out.println("1");
        }
    }
    }


