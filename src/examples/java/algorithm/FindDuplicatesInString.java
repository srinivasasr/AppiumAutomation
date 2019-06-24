package examples.java.algorithm;

public class FindDuplicatesInString {
    public static void main(String [] args){
        String str = "ssrr";
        char chars[]= str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(chars[i]==chars[j]){
                    System.out.println(chars[j]);
                    //count++;
                   // break;
                }
            }
        }
    }
}
