import java.util.Arrays;
public class Builtin_sort {

    public static void main(String[] args) {
        int arr[] = {12,31,44,1,2,3,4,66,777};
        Arrays.sort(arr,0,5);
                for(int i :arr){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i :arr){
            System.out.print(i + " ");
        }
        Arrays.sort(args);
    }
}