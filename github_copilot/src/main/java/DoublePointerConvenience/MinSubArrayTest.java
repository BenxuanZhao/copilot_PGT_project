package DoublePointerConvenience;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSubArrayTest {
    @Test
    public void testMinSubArrayLen() {
        MinSubArray minSubArray = new MinSubArray();

        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;

        int expected = 2;

        long startTime = System.nanoTime();
        int result = minSubArray.minSubArrayLen(s, nums);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Minimum Subarray Length: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}