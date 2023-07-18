package ArrayOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SetZeroMatrixTest {
    @Test
    public void testSetZeroes() {
        SetZeroMatrix setZeroMatrix = new SetZeroMatrix();

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };

        long startTime = System.nanoTime();
        setZeroMatrix.setZeroes(matrix);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertTrue(Arrays.deepEquals(expected, matrix));
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}