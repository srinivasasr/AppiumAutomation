package com.srini;

public class IntegerReverse {
    public static void main(String[] args) {
        int num = 24546657;
    /*    int num = 12345;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);*/
    StringBuffer sb = new StringBuffer(String.valueOf(num));
    System.out.println(sb.reverse());
    }
}
