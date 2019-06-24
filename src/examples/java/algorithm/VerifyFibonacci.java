package examples.java.algorithm;

public class VerifyFibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 0; i <= 9; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c+ " ");
        }

    }
}
