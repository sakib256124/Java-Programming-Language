import java.util.ArrayList;;

public class SizeOf_ArayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(10);
        list.add(11);
        System.out.println(list);
        System.out.print("Size of arraylist :");

        // in array list.length is a property , but here size( ) is a method
        System.out.println(list.size());

        //traversing
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
   
}
