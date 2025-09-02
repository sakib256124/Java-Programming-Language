import java.util.*;
public class Strings {
    public static void Dis(String s){
        int x =0,y = 0;
        for(int i = 0;i<s.length();i++){
               if(s.charAt(i) =='N'){
                y++;
             
               }
                else if(s.charAt(i)=='S'){
                    y--;
                 
                }
                else if(s.charAt(i)=='E'){
                    x++;
                  
                }
                else{
                    x--;
                   
                }
        }
        double z = Math.sqrt((x*x + y*y));
        System.out.println(z);
    }
    public static void Pallindrome(String sr){
        for(int i = 0;i<sr.length()/2;i++){
            if(sr.charAt(i) != sr.charAt(sr.length() -1-i)){
                System.out.println("this is not palindrome");
                return;
            }

        }
        System.out.println("pallindrome");
    }
    public static void main(String[] args) {
        String sr = "hellllo";
        Pallindrome(sr);
        Pallindrome("madam");
        Dis("NNESSENWWWWNS");
        
    }
    
}
