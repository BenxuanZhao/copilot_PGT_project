package ArrayOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTest {
    @Test
    public void testShuffle() {
        int[] nums = {1, 2, 3};
        Shuffle shuffle = new Shuffle(nums);

        long startTime = System.nanoTime();
        int[] result = shuffle.shuffle();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Shuffled Array: " + Arrays.toString(result));
        System.out.println("Execution time: " + duration + " nanoseconds");
    }

    @Test
    public void testReset() {
        int[] nums = {1, 2, 3};
        Shuffle shuffle = new Shuffle(nums);

        int[] expected = {1, 2, 3};

        long startTime = System.nanoTime();
        int[] result = shuffle.reset();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertArrayEquals(expected, result);
        System.out.println("Reset Array: " + Arrays.toString(result));
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}