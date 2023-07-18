package DoublePointerConvenience;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxAreaTest {
    @Test
    public void testMaxArea() {
        MaxArea maxArea = new MaxArea();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int expected = 49;

        long startTime = System.nanoTime();
        int result = maxArea.maxArea(height);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Max Area: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}