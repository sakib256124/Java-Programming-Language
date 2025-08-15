import java.util.*;

public class SelectionSort {

    public static void Sort(int arr[]){
        int sortarr[] = new int[arr.length];
    int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length -1;i++){
            
            for(int j = i+1;j<arr.length;j++){
                sortarr[i] = Math.min(arr[j-1],arr[j]);
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(sortarr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,4,8,6,9,7};
        Sort(arr);
    }
    
}
