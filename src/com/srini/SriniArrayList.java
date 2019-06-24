package com.srini;

import java.util.*;

public class SriniArrayList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value to search");

        int k = scan.nextInt();

        int[] arr = {2, 4, 5,9,34, 68, 94,100,200,234 };

        int first = 0;
        int last = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            int mid = (first + last) / 2;

            if (arr[mid] == k) {
                System.out.println("Found element at index: " + mid);
                break;
            } else if (k < arr[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }

        }
       /* if(first==last){
            System.out.println("Index value at :"+first);

        }
*/    }
}
