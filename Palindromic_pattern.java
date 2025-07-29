import java.util.*;
public class Palindromic_pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1;i <= n; i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k = i;k>=1;k--){
                System.err.print(k + " ");
            }
            for(int l = 2;l<=i;l++){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
