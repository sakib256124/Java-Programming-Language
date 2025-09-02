public class Backtrak {
    public static void F(int arr[], int val,int i){
        if(i == arr.length){
            Print(arr);
            return;  // stop recursion here
        }
        arr[i] = val;
        F(arr,val+1,i+1);
        
        // backtrack step (reset the value)
        arr[i] = arr[i] - 2;  
    }

    public static void Print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        F(arr, 1, 0);
        Print(arr);
    }
}
