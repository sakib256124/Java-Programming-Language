import java.util.ArrayList;

public class Pair_Sum1 {
    public static boolean pairSum1(ArrayList<Integer> list ,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp){
            int sum = list.get(lp) + list.get(rp);
            if (target == sum){
                return true;
            }

            if(sum<target){
                lp ++;
            }
            else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1-6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 51; // for 5  it gives true
        System.out.println(pairSum1(list ,target));
    }
    
}
