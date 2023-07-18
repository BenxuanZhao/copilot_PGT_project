package DoublePointerConvenience;

public class MaxProfit {
    /* Here is the explanation for the code above:
1. At the very beginning, we set the min price to be a very large number and set the max profit to be 0.
2. Then we iterate through the array, and each time we find a new minimum price, we update the min price.
3. For each price, we calculate the profit by substracting the min price from the current price.
4. Then we update the max profit if the current profit is larger than the previous max profit.
5. Finally, we return the max profit. */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            } else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
