import java.util.*;
public class Binary {
    public static int binarySearch(int arr[], int key){
         int start = 0;
         int end = arr.length -1;
         
         while (start<=end) {
             int middle = (end + start)/2;
             if(key == arr[middle]){
                return middle;
             }
             else if(key< arr[middle]){
                end = middle -1;
             }else{
                start = middle +1;
             }
         }
         return -1;
      }
      public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,23,24,34,54};
        int key = 14;
        int x = binarySearch(arr, key);
        if(x == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Element found at index :"+ x);
        }
      }
    
}
