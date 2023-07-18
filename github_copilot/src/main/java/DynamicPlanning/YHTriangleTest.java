package DynamicPlanning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class YHTriangleTest {
    @Test
    public void testGenerate() {
        YHTriangle yhTriangle = new YHTriangle();

        int numRows = 5;

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));

        long startTime = System.nanoTime();
        List<List<Integer>> result = yhTriangle.generate(numRows);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Yanghui Triangle: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}