import java.util.*;
public class CallByValueandReference {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(Strings[] args) {
        int a =5;
        int b = 9;
        swap(a, b);// here makes copy of original a, b ,, not actual a and b
        System.out.println(a ); //5
        System.out.println(b); //9  because call by value
    }
    
}
