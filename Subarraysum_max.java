import java.util.*;

public class Subarraysum_max {

    public static int Max_Subarr(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // Build prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int max = Integer.MIN_VALUE;

        // Try all subarrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int subarraySum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                max = Math.max(max, subarraySum);
            }
        }

        return max;
    }

    public static void main(Strings[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum subarray sum is: " + Max_Subarr(arr));
    }
}
