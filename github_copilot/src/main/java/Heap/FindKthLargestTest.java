package Heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKthLargestTest {
    @Test
    public void testFindKthLargest() {
        FindKthLargest findKthLargest = new FindKthLargest();

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int expected = 5;

        long startTime = System.nanoTime();
        int result = findKthLargest.findKthLargest(nums, k);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Kth Largest Element: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}