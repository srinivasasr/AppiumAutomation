package com.srini;

import javafx.beans.binding.ObjectExpression;

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ddddd");
        list.add("bbbbbb");
        list.add("ccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("ddddd");
        list.add(0, "srinivas");
        //System.out.println(list);
        //Collections.sort(list);

        //System.out.println(list);
        //list.remove(1);
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object asr = it.next();
            System.out.println(asr);
        }

        //System.out.println(list.contains("ccccc"));
        //Object [] arr = list.toArray();
        //System.out.println(Arrays.toString(arr));

        // for (Object asr : list) {
        //System.out.println(list.get(0));

        //}

    }

}

