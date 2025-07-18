import java.util.*;
public class TypePromotion {

    public static void main(String[] args) {
        // Type promotion occurs when expression are used
         short a = 5;
         byte b = 34;
         char c = 'c';
         System.out.println(a+b+c);  //all convert in integer and result intger

        byte bt = (byte)(a+b+c); 
        System.out.println(bt);// now it convert into byte
        
        int p = 10;
        float f = 23.34f;
        long l = 45;
        double d = 30;
        double ans = p + f + l + d;
        System.out.println(ans);
        byte m = 5;
        //byte n = m*2;  m*2 -> is now integer
        byte n = (byte)(m*2);
        System.out.println(n);
        
    }
        
    }
