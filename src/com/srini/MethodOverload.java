package com.srini;

public class MethodOverload {
    public static int i = 10;
    public static int j = 20;
    public static String s = "srini";

    public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();
        mo.test();
        String str = mo.test(s);
        System.out.println(str);
//mo.test(i);
    }

    public void test() {
        System.out.println("no prameters");
    }

    public int test(int i, int j) {
        int sum = i + j;
        System.out.println("two prameters");
        return sum;
    }

    public String test(String s) {
        //StringBuffer sb = new StringBuffer();
        int i = s.length() - 1;
        String txt = "";
        while (i >= 0) {

            txt += s.charAt(i);
            i--;

        }

        return txt;

    }
}
