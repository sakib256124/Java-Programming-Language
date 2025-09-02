import java.util.*;

public class Compress {
    public static String com(String s){
        Integer count ;
        StringBuilder a = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            count = 1;
            while (i<s.length() -1 && s.charAt(i) ==s.charAt(i+1)) {
                count ++;
                i++;
            }
            a.append(s.charAt(i));
            if(count>1){
                a.append(Integer.toString(count));

            }
        }

        return a.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbccccdddddd";
        System.out.println(com(s));
    }
}
