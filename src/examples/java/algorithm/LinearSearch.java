package examples.java.algorithm;

public class LinearSearch {
    public static void main(String [] args){
        int arr[] = {1,2,4,5,6,8,9};
        int num = 3;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(arr[i]);
            }else{
                System.out.println("not found");
            }
        }
    }
}
