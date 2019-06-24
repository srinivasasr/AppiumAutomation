package examples.java.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInArray {

    public static void main(String [] args){
        List<String> li = new ArrayList <String>();
        for(int i=0;i<10;i++){
            li.add(String.valueOf(i));
        }

        for(int i=0;i<5;i++){
            li.add(String.valueOf(i));
        }
       // System.out.println(li);
        System.out.println(duplicates(li));
    }


    public static Set<String> duplicates(List<String> duparr) {
        Set <String> set = new HashSet <String>();
        for(String intval : duparr){
            set.add(intval);
        }
        return set;
    }
}
