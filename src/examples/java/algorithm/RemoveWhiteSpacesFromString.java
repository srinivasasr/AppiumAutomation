package examples.java.algorithm;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {

        //Metchod 1
        String str = "my name    is srini";
        String str2 = str.replace(" ", "");
        System.out.println(str2);

        //Method 2
        String s = "my name is Diva";
        String s1 = s.replaceAll("\\s", "");
        System.out.println(s1);

        //Method 3
        String str1 = "Srini is an Autom ation Engi ne      er";
        char[] chars = str1.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] != ' ') && (chars[i] != '\t')) {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);
    }
}