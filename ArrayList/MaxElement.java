import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(1);
        list.add(7);
        list.add(5);

        int max = list.get(0); // assume first element is max
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("ArrayList: " + list);
        System.out.println("Maximum element: " + max);
    }
}
