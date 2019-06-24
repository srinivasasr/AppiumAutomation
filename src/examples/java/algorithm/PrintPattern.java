package examples.java.algorithm;

public class PrintPattern {

    public static void main(String [] args){

        for(int i=1;i<5;i++){
            System.out.println();
            for(int j =1;j<i+1;j++){
                System.out.print(j);
            }
        }
    }
}
