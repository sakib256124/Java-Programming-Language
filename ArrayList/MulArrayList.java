import java.util.ArrayList;
//multidimentional arrayList
public class MulArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();

        list1.add(2);
        list1.add(5);
        list1.add(7);

        list2.add(3);
        list2.add(4);
        list2.add(8);
        list2.add(9);

        list3.add(11);
        list3.add(22);
        list3.add(33);
        list3.add(44);
        list3.add(55);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        // l1 -2 5 7 
        // l2 -3 4 8 9
        // l3 -11 22 33 44 55

        // Mal [[2, 5, 7], [3, 4, 8, 9], [11, 22, 33, 44, 55]]
        // travarse 2 D arraylist
        for(int i = 0; i<mainList.size();i++){
            ArrayList<Integer>CurrList = mainList.get(i);
            for(int j = 0;j<CurrList.size();j++){
                System.out.print(CurrList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(mainList);
        
    }
}
