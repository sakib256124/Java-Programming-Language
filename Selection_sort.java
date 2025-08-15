import java.util.*;

public class Selection_sort {
    public static void Selection(int array[], int n){
        for(int i = 0;i< n-1;i++){
            int minPos = i;
            for(int j = i+1;j<n;j++){
                if(array[minPos]>array[j]){
                    minPos = j;
                }
            }

            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
        for(int i :array){
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,12,34,24,65,63,4};
        int n = arr.length;
        Selection(arr,n);
    }
}
