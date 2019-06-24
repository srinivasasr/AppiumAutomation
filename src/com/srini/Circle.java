package com.srini;

import jdk.internal.util.xml.impl.Input;
import sun.plugin.javascript.navig.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.text.*;

public class Circle {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "aaa");
        hm.put(2, "bbb");
        hm.put(3, "ccc");


        for ( Map.Entry m : hm.entrySet())
        System.out.println(m.getKey()+" "+m.getValue());
    }
}
