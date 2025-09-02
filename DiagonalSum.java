public class DiagonalSum {
    public static int Diagonal(int arr[][]){
        int sum = 0;
        for(int i = 0;i<arr.length ;i++){
            sum = sum+ arr[i][i];
            if(i != arr.length -1-i)
                sum = sum+ arr[i][arr.length -1-i]; // diagonal 2, i+j = length -1 so j = length -1-i
        }
        return sum;
    }
    
    public static void main(Strings[] args) {
        int arr[][] = {
            {1,2,3,4},
            {8,7,6,5},
            {11,22,33,44},
            {12,23,34,45}
        };
        System.out.println(Diagonal(arr));//op = 1 2 3 4 5 44 45 34 23 12 11 8 7 6 33 22 
        
    }
}
