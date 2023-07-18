package DoublePointerConvenience;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainTest {
    @Test
    public void testTrap() {
        Rain rain = new Rain();

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int expected = 6;

        long startTime = System.nanoTime();
        int result = rain.trap(height);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Rainwater Trapped: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}