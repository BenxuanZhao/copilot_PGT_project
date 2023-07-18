package DynamicPlanning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class All1SquareMatrixTest {
    @Test
    public void testCountSquares() {
        All1SquareMatrix all1SquareMatrix = new All1SquareMatrix();

        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };

        int expected = 15;

        long startTime = System.nanoTime();
        int result = all1SquareMatrix.countSquares(matrix);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Number of All-1 Square Matrices: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}