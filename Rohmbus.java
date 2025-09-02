import java.util.Scanner;

public class Rohmbus {

    public static void main(Strings[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }for(int j = 1;j<=n;j++){
            if( i ==1 || i ==n || j ==1 || j ==n){
                
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
            }
           
            System.out.println();
        }
    }
    
}
