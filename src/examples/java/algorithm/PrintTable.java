package examples.java.algorithm;

import java.util.Scanner;

public class PrintTable {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i =0;
        int des;
        String x="";
        while (num > 0) {
             des = num % 2;
            num = num / 2;
            i++;
            x=x+des;
        }
        System.out.println(x);
    }
}
