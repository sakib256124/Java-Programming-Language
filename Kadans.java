import java.util.*;
public class Kadans {
    public static int Max_Subarr(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;i<arr.length;i++){
            currSum = currSum + arr[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(Strings[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i]  =  sc.nextInt();
        }
        int max = Max_Subarr(arr);
        System.out.println(max);
    }
}
