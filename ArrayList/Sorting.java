import java.util.ArrayList;
import java.util.Collections;

public class Sorting {public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(10);
        list.add(11);
        System.out.println(list);

        //must import Collections class not Collection
        Collections.sort(list);  // by default ascending order
        System.out.println(list);

        // Descending order sorting
        Collections.sort(list,Collections.reverseOrder()); // here reverseOrder() is a comperator , define sorting logic 
        System.out.println(list);
}

}
