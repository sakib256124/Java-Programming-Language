import java.util.*;
public class Prime {

    // Check is a number is prime or not
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n <= 2)
           return true;
        
        for(int i = 2;i<= Math.sqrt(n);i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    // Print prime number till n
    public static void generator_Prime(int n){
         if(n<2)
            System.out.println("Here not prime number ");

            for(int i =3;i<=n;i++){
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
         
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(isPrime(a));
        generator_Prime(n);
    }
    
}