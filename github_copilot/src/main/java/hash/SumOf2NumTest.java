package hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOf2NumTest {
    @Test
    public void testTwoSum() {
        SumOf2Num sumOf2Num = new SumOf2Num();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};

        long startTime = System.nanoTime();
        int[] result = sumOf2Num.twoSum(nums, target);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertArrayEquals(expected, result);
        System.out.println("Indices of Two Numbers: " + result[0] + ", " + result[1]);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}