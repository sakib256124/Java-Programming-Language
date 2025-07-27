import java.util.*;;
public class BInary_to_decimal {

    public static void binToDec(int n){
        int dec = 0;
        int pow = 0;
        while(n>0){
            int ld = n%10;
            n = n/10;
            dec = dec + (int)(ld*Math.pow(2,pow));
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binToDec(n);

    }
}
