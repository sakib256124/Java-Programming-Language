import java.util.*;
public class Diamond {
    public static void main(Strings[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
