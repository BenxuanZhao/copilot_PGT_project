package DynamicPlanning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStairsTest {
    @Test
    public void testMinCostClimbingStairs() {
        MinStairs minStairs = new MinStairs();

        int[] cost = {10, 15, 20};

        int expected = 15;

        long startTime = System.nanoTime();
        int result = minStairs.minCostClimbingStairs(cost);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Minimum Cost Climbing Stairs: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}