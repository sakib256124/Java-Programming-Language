public class Fibonacchi {
    public static int Fibo(int n){
        if(n ==1|| n==0){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(Strings[] args) {
        int n = 6;
        System.out.println(Fibo(5 ));
        System.out.println(Fibo(6));
        System.out.println(Fibo(7));
        System.out.println(Fibo(8));
        System.out.println(Fibo(9));
        System.out.println(Fibo(20));
    }
}