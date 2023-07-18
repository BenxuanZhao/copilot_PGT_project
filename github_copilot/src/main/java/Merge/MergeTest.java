package Merge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {
    @Test
    public void testMerge() {
        Merge merge = new Merge();

        // Input intervals: [[1,3],[2,6],[8,10],[15,18]]
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        // Expected result: [[1,6],[8,10],[15,18]]
        int[][] expected = {{1,6},{8,10},{15,18}};

        long startTime = System.nanoTime();
        int[][] result = merge.merge(intervals);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertTrue(Arrays.deepEquals(expected, result));
        System.out.println("Result: " + Arrays.deepToString(result));
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}