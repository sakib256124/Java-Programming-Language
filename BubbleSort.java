import java.util.*;
public class BubbleSort {
    
    public static void Sort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length -i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(Strings[] args) {
        int arr [ ] = {4,5,7,1,2, 8,9,10};
        Sort(arr);
    }
}
