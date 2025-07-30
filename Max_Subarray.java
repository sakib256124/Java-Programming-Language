import java.util.*;
public class Max_Subarray {
    public static int Max_Subarr(int arr[]){
        int max = -44545;
        int sum = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int start = i;start<arr.length ;start++){
                for(int end = i;end<=start;end++){
                    sum = sum+ arr[end];
                }
                System.out.println(sum);
               max = Math.max(max, sum);
               sum = 0;

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc  = new Scanner(System.in);

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Max_Subarr(arr));
    }
}
