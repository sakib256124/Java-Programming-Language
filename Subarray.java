import java.util.*;
public class Subarray {
    public static void Subarr(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int start = i;start<arr.length ;start++){
                for(int end = i;end<=start;end++){
                    System.out.print(arr[end] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for ( int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Subarr(arr);
    }
}
