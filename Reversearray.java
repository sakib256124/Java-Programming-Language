import java.util.*;
public class Reversearray {
    public static void Reverse(int arr[]){
        int first = 0;
        int last = arr.length -1 ;
        while (first<last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first ++;
            last --;
        }
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            
        }
        Reverse(arr);
        for(int d :arr){
                System.out.print(d + " ");
            }
    }
}
