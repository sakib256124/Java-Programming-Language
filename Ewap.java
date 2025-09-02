public class Ewap {
    //swaping without using third variable ,using only x or 
    public static void main(String[] args) {
        int x = 6;
        int y = 20;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("x = "+ x + " y = " + y);
        int   z = 8;
        System.out.println(~z);
        System.out.println(~z+1);
        System.out.println(-~z);
    }
    
}
