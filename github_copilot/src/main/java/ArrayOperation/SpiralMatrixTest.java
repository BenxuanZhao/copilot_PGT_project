package ArrayOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
    @Test
    public void testSpiralOrder() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);

        long startTime = System.nanoTime();
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Spiral Order: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}