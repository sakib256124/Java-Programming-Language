import java.util.Scanner;

public class Method {
    public static int Add(int a, int b){ // here a, b are formal perameter or perameter
        return a+ b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println( "add " + Add(c,d));// here c, d are actual perameter 
    }
}
