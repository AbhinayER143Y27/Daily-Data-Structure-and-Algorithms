package ArrayList;

public class OneTwoTwoBestTimeToBuyStocks { public int maxProfit(int[] prices) {
    int smallest = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
        if (smallest > prices[i]) {
            smallest = prices[i];
        } else if (smallest < prices[i]) {
            profit += prices[i] - smallest;
            smallest = prices[i];
        }
    }
    return profit;
}
}
