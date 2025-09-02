import java.util.Scanner;

public class Array {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare the array   
        //int[] arr = new int[]{10, 20, 30, 40, 50};

        int[] arr = new int[n];

        // Take array input
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the array
        System.out.print("You entered: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //sout(marks.length)

        sc.close();
    }
}
