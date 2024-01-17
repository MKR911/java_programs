import java.util.*;

public class buy_sell_stock {
    
    public static int buySellStocks(int prices[]) {
        int buyP = Integer.MAX_VALUE;
        int maxP = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyP < prices[i]) {
                int profit = prices[i] - buyP;
                maxP = Math.max(maxP, profit);
            }
            else{
                buyP = prices[i];
            }
        }

        return maxP;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int prices[] = new int[5];

        for(int i = 0; i < 5; i++){
            prices[i] = sc.nextInt();
        }  
    
        System.out.println(buySellStocks(prices));
    }
   
}