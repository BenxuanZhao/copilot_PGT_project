package NumOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntReverseTest {
    @Test
    public void testReverse() {
        IntReverse reverse = new IntReverse();

        int x = 12345;
        int expected = 54321;

        long startTime = System.nanoTime();
        int result = reverse.reverse(x);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Result: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}