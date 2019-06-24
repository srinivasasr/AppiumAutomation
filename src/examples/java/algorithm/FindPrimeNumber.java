package examples.java.algorithm;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num<=1){
            System.out.println("Not a valid number");
        }else if(num%2==0){
            System.out.println(+num+" is not a prime number");
        }else {
            System.out.println(+num+" is a prime number");
        }
    }
}
