import java.util.*;
public class Two_Darray {
    public static void main(Strings args[]){
        int  array[][]= new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                array[i][j] = sc.nextInt();
            }
        }
        int max = -23244343;
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                max = Math.max(max,array[i][j]);
            }

        }
        System.out.println(max);
    }
}
