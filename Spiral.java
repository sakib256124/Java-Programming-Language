public class Spiral {
    public static void Spiral_print(int arr[][]){
        int strow = 0;
        int stcol = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length -1;

        while(strow<=endrow && stcol<=endcol){
            //for start row
            for(int j = stcol;j<=endcol;j++){
                System.out.print(arr[strow][j] + " ");
            }
             if (strow == endrow) break;
            // for end col
            for(int i = strow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol] + " ");
            }
            if (stcol == endcol) break;
            //end row 
            for(int j = endcol-1; j>=stcol;j--){
                System.out.print(arr[endrow][j] + " ");
            }
            //for stcol
            for(int i = endrow -1;i>=strow +1;i--){
                System.out.print(arr[i][stcol] + " ");
            }
            strow ++;
            stcol ++;
            endrow --;
            endcol --;
        }
    }
    public static void main(Strings[] args) {
        int arr[][] = {
            {1,2,3,4},
            {8,7,6,5},
            {11,22,33,44},
            {12,23,34,45}
        };
        Spiral_print(arr);//op = 1 2 3 4 5 44 45 34 23 12 11 8 7 6 33 22 
        
    }
    
}
