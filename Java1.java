import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        // int col = sc.nextInt();
        // for(int i = 1;i<= row;i++){
        //     for(int j = 1 ;j<= col;j++){
        //         if(i == 1 || j ==1|| i ==row || j==col){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        for(int i = 1 ;i<=row;i++){
            for (int j = 1;j<= row-i+1;j++){
                System.out.print(j);;
            }
            System.out.println();
        }
    }
}
