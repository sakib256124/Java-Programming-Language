import java.util.Scanner;

public class BinarySr2D {
    public static void Search(int arr[][], int key){
        int col = arr[0].length-1;
        int row = 0;
        
        
        while(row < arr.length && col >= 0){
            if(key == arr[row][col]){
                System.out.println("array found at ["+ row +"," +col+"]");
                return;
            }
            else if(key>arr[row][col]){
                row++; //check down
            }
            else {
                col--;//check left
            }
            

        }
        System.out.println("Not found ");
    }
    public static void main(Strings[] args) {
        int arr[][] = {
            {11,12,13,14},
            {22,27,28,29},
            {31,32,33,44},
            {62,73,84,95}
        };
        int key;
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        Search(arr,key);
        
    }
}
