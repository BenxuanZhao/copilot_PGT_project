package DoublePointerConvenience;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        int[] nums = {1, 1, 2, 2, 2, 3, 4, 5, 5};

        int expected = 5;

        long startTime = System.nanoTime();
        int result = removeDuplicates.removeDuplicates(nums);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Unique Elements Count: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}