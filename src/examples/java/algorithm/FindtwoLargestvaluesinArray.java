package examples.java.algorithm;

import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindtwoLargestvaluesinArray {
    public static void main(String[] args){
        int arr[] = {29,41,48,24,44,21,28};
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max1 = 0;
        int max2 = 0;

        for(int n :arr){
            if(max1<n){
                max2 = max1;
                max1=n;
            }else if(max2<n){
                max2=n;
            }

        }
        System.out.println(max1);
        System.out.println(max2);
    }

}
