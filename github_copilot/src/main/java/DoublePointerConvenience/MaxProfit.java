package DoublePointerConvenience;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int money = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > money) {
                money = prices[i] - min;
            }
        }
        return money;
    }
}
