package com.srini;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class Linkexamples {
    public static void main(String [] args){
        List<String> ll = new LinkedList<String>();
        ll.add("srinivas");
        ll.add("diva");
        ll.add("aditya");
        ll.add("sravanth");
        ll.add("allambai");
        //System.out.println(ll.get(3).trim());
for(int i=0;i<ll.size();i++){
    System.out.println(ll.get(i));
}

    }
}
