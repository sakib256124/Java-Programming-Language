import java.util.*;
public class Rainwater {
    public static int containRain(int arr[]){
        int leftMax[] = new int[arr.length];
        int rightMax[] =new int[arr.length];

        leftMax[0] = arr[0];
        rightMax[arr.length -1] = arr[arr.length -1];
       
        for(int i = 1;i<arr.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }

        for(int j = arr.length -2;j>=0;j--){
            rightMax[j] = Math.max(rightMax[j+1], arr[j]);
        }
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(rightMax[i] + " ");
        // }

        int water = 0;
        for(int i = 1;i<arr.length-1;i++){
            int temp = Math.min(leftMax[i],rightMax[i]) - arr[i];
            
            water = water+ temp;
            temp = 0;
        }
        return water;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,3,5,1,6,1};
        System.out.println(containRain(arr));
    }
}
