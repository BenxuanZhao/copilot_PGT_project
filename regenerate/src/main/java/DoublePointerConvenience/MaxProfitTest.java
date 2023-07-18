package DoublePointerConvenience;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxProfitTest {
    @Test
    public void testMaxProfit() {
        MaxProfit maxProfit = new MaxProfit();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int expected = 5;

        long startTime = System.nanoTime();
        int result = maxProfit.maxProfit(prices);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Max Profit: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }

}