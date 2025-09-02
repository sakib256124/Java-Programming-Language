import java.util.*;
public class Overloading {
    public static void Add(int a, int b){ 
        System.out.println(a + b); 
    }
    //Overloading with different datatype perameter
    public static void Add(float a, float b){
        System.out.println(a + b);
    }

    public static void Mul(int a, int b){
        System.out.println("Multiplication(ab) :" + a*b);
    }
    //Overloading with same type but different number perameter 
    public static void Mul(int a, int b,int c){
        System.out.println("Multiplication(abc) :" + a*b*c);
    }
    public static void main(Strings[] args) {
        int a = 2,b=5,c= 9;
        float e = 5.3f,d = 5.2f;
        Add(a, b);
        Add(e, d);
        Mul(a, b);
        Mul(a, b,c);
    }
}
