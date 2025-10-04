import java.util.ArrayList;

import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
        // Arraylist is the part of java collection framework
        // declare an integer type arraylist ,here list is the obj
        //syntax
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        // adding element in a arraylist
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(10);
        list.add(11);

        // add direct i th position
        list.add(19);

        //printing the arraylist
        System.out.println(list);

        //printing i th element
         int element = list.get(2);
         System.out.println(element);

         //remove individual i th element
         list.remove(4);
         System.out.println(list);

         // set a element in arraylist(remove a element and add element i th porition)
         list.set(2, 18); // index 2 value set now 18
         System.err.println(list);

         //Contain element , if a element exist or not in a arraylist
         System.out.println(list.contains(3));//false
         System.out.println(list.contains(18));//true
    }
}
