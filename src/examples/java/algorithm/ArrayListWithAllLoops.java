package examples.java.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithAllLoops {


    static List <Integer> compareTriplets(List <Integer> a, List <Integer> b) {
        int x = 0;
        int y = 0;
        List <Integer> l = new ArrayList <Integer>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                x++;
            } else if (b.get(i) > a.get(i)) {
                y++;
            }
        }
        l.add(x);
        l.add(y);
        return l;
    }

    public static void main(String[] args) {
        String[] arr = {"aa", "bb", "cc", "dd", "ee", "ff", "gg"};

        //Method 2: converting array to list and passing list as a constructor
        List ls = Arrays.asList(arr);
        ArrayList <String> al = new ArrayList <String>(ls);

        //Method 1: This is another method to add array to list
      /*  for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }*/

        //Using Iterator & while
        Iterator <String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(al.get(i));
        }

        //Using advanced for loop
        for (String sr : al) {
            System.out.println(sr);
        }

    }
}
