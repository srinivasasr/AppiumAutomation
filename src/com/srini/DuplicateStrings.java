package com.srini;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStrings {
    public static void main(String[] args) {
        String names[] = {"java", "c++", "phyton", "ruby", "java","java"};

        HashMap<String, Integer> hasset = new HashMap<String, Integer>();

        for (String key : names) {
            Integer count = hasset.get(key);
            if (count == null) {
                hasset.put(key, 1);
            } else {
                hasset.put(key, count+1);
            }
        }
        System.out.println(hasset);
    }
}
