package examples.java.algorithm;

public class SwapVariables {
    public static void main(String[] args) {

        //swap values using temp veriables
        int a = 5;
        int b = 6;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a value: " + a + " b value: " + b);

        // swap values without using temp variable
        int x = 7;
        int y = 8;
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x value: " + x + " y value: " + y);

    }
}
