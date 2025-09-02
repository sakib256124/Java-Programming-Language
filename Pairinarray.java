import java.util.*;
public class Pairinarray {
    public static void main(Strings[] args) {
        int arr[] = {12,23,34,45,65,76,44,33,43,77};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+ arr[i] + ","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    
}
