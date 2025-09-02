import java.util.Scanner;

public class Pass_arraytoFunction {
    public static void Update(int arr[]){
        for(int i = 0;i<arr.length;i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4];
        
        for(int i = 0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("printing before");
        for(int i : arr){
             System.out.print(i+ " ");
        }
        Update(arr);

        System.out.println("printing after");
        for(int i : arr){
             System.out.print(i+ " ");
        }
    }
    
}
