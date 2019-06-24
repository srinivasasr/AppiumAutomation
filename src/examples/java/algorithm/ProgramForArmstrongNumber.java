package examples.java.algorithm;

public class ProgramForArmstrongNumber {
    public static void main(String[] args) {

        /*First of all we need to understand what Armstrong Number is. Armstrong number is the number
        which is the sum of the cubes of all its unit, tens and hundred digits for three digit number.
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153*/

        int num = 153;
        int rem, act = 0,temp=num;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            act += (rem * rem * rem);
        }
        if(temp==act){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
