import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list ,int target){
        int bp = -1;// breaking point or pivot
        for(int i = 0;i<list.size() -1;i++){
            if(list.get(i) > list.get(i+1));
            bp =1;
            break;
        }

        int lp = bp+1; //smallest
        int rp = bp;    // largest 

        while(lp != rp){
            int sum = list.get(lp) + list.get(rp);
            //case 1
            if (target == sum){
                return true;
            }
            //case 2
            if(sum<target){
               lp = (lp + 1)% list.size();
            }
            //case 3
            else{
                rp = (list.size() + rp -1) % list.size();
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //rotate shorted and rotated array list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16; // for 5  it gives talse
        System.out.println(pairSum2(list ,target));
    }
    
}
