public class BestTimeToBuyAndSellStock {

    /*
Greedy approach - buyValue is always minimum of previous days. For each day, calculate the 
local profit (sell price - buy price). Return the max global profit.

*/


class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyValue = prices[0];
        for (int price : prices) {
            if (price < buyValue) {
                buyValue = price;
            }
            maxProfit = Math.max(maxProfit, price - buyValue);
        }
        return maxProfit;
    }
}

}
