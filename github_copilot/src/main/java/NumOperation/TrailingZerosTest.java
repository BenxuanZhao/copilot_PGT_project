package NumOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrailingZerosTest {
    @Test
    public void testTrailingZeroes() {
        TrailingZeros trailingZeros = new TrailingZeros();

        int n = 25;
        int expected = 6;

        long startTime = System.nanoTime();
        int result = trailingZeros.trailingZeroes(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Result: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}