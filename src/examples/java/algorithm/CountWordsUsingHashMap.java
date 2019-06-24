package examples.java.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountWordsUsingHashMap {
    public static void main(String[] args) {
        String str = "This This is is done by Srini Srini";
        String[] str1 = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < str1.length; i++) {
            int count = 1;
            if (map.containsKey(str1[i])) {
                map.put(str1[i], count + 1);
            } else {
                map.put(str1[i], count);
            }
        }

        //Iterate using while loop
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry mp1 = (Map.Entry) it.next();
            System.out.println(mp1.getKey() + " = " + mp1.getValue());
        }

        //Iterate using advane for loop
        for (Map.Entry mp : map.entrySet()) {
            System.out.println(mp.getKey() + " = " + mp.getValue());

        }
    }
}
