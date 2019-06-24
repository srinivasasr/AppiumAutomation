package com.srini;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsAL {
    public static void main(String [] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("aaaa");
        al.add("bbb");
        al.add("ccc");
        al.add("bbb");
        al.add("eee");
        al.remove(0);
        al.set(3,"srini");
        //al.clear();
       // System.out.println(al.get(1));

        System.out.println("###########Advanced for loop#######");
            for (String i : al){
                System.out.println(i);

        }
        System.out.printf("###### iterator#######");
            Iterator<String> at = al.iterator();
            while(at.hasNext()){
                System.out.println(at.next());
            }

        System.out.println("*********for loop*******");
            for(int i=0;i<al.size();i++){
                System.out.println(al.get(i));
            }
    }
}
