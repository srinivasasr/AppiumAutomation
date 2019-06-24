package examples.java.algorithm;

import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 2, 3, 4};
        Integer[] a2 = {3, 4, 5, 6, 7};

        List<Integer> list = Arrays.asList(a1);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a2.length; i++) {
            set.add(a2[i]);
        }

        set.addAll(list);
    /*  Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        Integer[] a = new Integer[set.size()];
        a = set.toArray(a);
        System.out.println(Arrays.toString(a));

        //Second method
        int[] x = {1, 2, 3, 4};
        int[] y = {5, 6, 7, 8};
        int[] z = new int[x.length + y.length];
        //int count = 0;
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];


        }
        int p = x.length;
        for (int j = 0; j < y.length; j++) {
            z[p++] = y[j];
        }

        for (int k = 0; k < z.length; k++) {
            System.out.println(z[k]);
        }
    }
}
