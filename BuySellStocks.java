import java.util.*;

public class BuySellStocks {
    public static void Profit(int price[]){

        int buying_Price = Integer.MAX_VALUE, sell,profit,
        max_profit = 0;
        // for(int k =0;k<price.length;k++){
        //     if(buying_Price<price[k]){
        //         profit = price[k] -  buying_Price;
        //         max_profit = Math.max(max_profit, profit);
        //     }else{
        //         buying_Price = price[k];
        //     }
        // }
        // System.out.println(max_profit);
        for(int i = 0;i<price.length;i++){

            for(int j = i+1;j<price.length;j++){

                buying_Price = price[i];
                sell = price[j];
                profit = sell - buying_Price;
                max_profit = Math.max(max_profit,profit);
            }

        }
        System.out.println(max_profit);
    }
    public static void main(Strings[] args) {
        int price[] = {7,1,5,3,6,4};
        Profit(price);
    }
    
}
