public class Fact_Rec {
    public static int Fact(int n){
        if(n == 1){
            return 1;
        }
        return n* Fact(n-1);

    }

    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n + Sum(n-1);
    }
    public static void main(Strings[] args) {
        int n = 5;
        int fac = Fact(n);
        System.out.println(fac);
        System.out.println(Sum(n));

    }
}