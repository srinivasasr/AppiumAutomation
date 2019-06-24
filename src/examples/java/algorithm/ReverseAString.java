package examples.java.algorithm;

public class ReverseAString {
    public static void main(String[] args) {

   // String Reverse converting string into char Array

        String str1 = "srinivas Allambai";
        String rev1 = "";
        char chars[] = str1.toCharArray();
        for (int i = str1.length() - 1; i > 0; i--) {
            System.out.print(chars[i]);
        }

    //String reverse using split method

        String str2 = "srinivas allambai";
        String[] rev2 = str2.split("");
        for (int i = rev2.length - 1; i > 0; i--) {
            System.out.print(rev2[i]);
        }


    //string reverse using predefind class string builder

        String str3 = "srinivas allambai";
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        System.out.println(sb.reverse());

    }

}
