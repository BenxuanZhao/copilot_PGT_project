package DoublePointerConvenience;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeNumSumTest {
    @Test
    public void testThreeSum() {
        ThreeNumSum threeNumSum = new ThreeNumSum();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));

        long startTime = System.nanoTime();
        List<List<Integer>> result = threeNumSum.threeSum(nums);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Three Number Sums: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}