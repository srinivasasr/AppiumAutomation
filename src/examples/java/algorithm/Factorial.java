package examples.java.algorithm;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int fct = scan.nextInt();

        int fact = 1;
        for(int i=1;i<=fct;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
