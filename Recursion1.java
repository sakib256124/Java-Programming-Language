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
    public static void main(String[] args) {
        int n = 10;
        Dec(n);

    }
    
}
