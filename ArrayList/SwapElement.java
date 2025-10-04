import java.util.ArrayList;

public class SwapElement {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
            // swap
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp); 

        System.out.println("After swap: " + list);
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Before swap: " + list);

        int idx1 = 1; // index of first element (20)
        int idx2 = 3; // index of second element (40)
        swap(list, idx1, idx2);
        
    }
}
