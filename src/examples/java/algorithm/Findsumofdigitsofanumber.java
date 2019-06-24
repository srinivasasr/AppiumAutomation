package examples.java.algorithm;

public class Findsumofdigitsofanumber {
    public static void main(String [] args){
        int num = 1234;
        int sum =0;
        while(num!=0){
            int reminder = num%10;
            sum += reminder;
            num = num/10;
        }
        System.out.println(sum );

    }

}
