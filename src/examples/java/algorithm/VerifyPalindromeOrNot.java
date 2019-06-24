package examples.java.algorithm;

import java.util.Scanner;

public class VerifyPalindromeOrNot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = "";
        String[] str1 = str.split("");
        for (int i = str1.length - 1; i >= 0; i--) {
            str2 += str1[i];
        }
        if (str.equals(str2)) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

}
