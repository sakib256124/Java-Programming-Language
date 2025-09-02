public class Recursion1 {
    public static void Dec(int n){
        if (n ==1) {
            System.out.print(n + " ");
            return;
         }
         //System.out.print(n + " ");// its work before recursive call
         Dec(n -1);
         System.out.print(n + " ");     // it's work after all recursive call
    
    }
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length -1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccrance(int arr[], int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccrance(arr, key, i+1);
    }
    public static void main(Strings[] args) {
        int n = 10;
        Dec(n);
        System.out.println();
        int arr[] ={1,32,44,55,66,77,88};
        int arr2[] ={1,32,14,55,66,77,14,88};

        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr2, 0));
        System.out.print("The first occarn : ");
        System.out.println(firstOccrance(arr2, 14, 0));

    }
    
}
