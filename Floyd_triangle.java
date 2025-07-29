import java.util.*;
public class Floyd_triangle {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int temp = 0;
    for(int i = 1;i<=a;i++){
        for(int j =1;j<=i;j++){
            temp = temp +1;

            System.out.print(temp + " ");

        }
        System.out.println();
    }
    }
}
