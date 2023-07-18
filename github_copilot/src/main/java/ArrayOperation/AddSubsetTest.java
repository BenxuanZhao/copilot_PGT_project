package ArrayOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddSubsetTest {
    @Test
    public void testSubsets() {
        AddSubset addSubset = new AddSubset();

        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1, 2),
                Arrays.asList(3),
                Arrays.asList(1, 3),
                Arrays.asList(2, 3),
                Arrays.asList(1, 2, 3)
        );

        long startTime = System.nanoTime();
        List<List<Integer>> result = addSubset.subsets(nums);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}