package NumOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntTest {
    @Test
    public void testMyAtoi() {
        StringToInt stringToInt = new StringToInt();

        String str = "42";
        int expected = 42;

        long startTime = System.nanoTime();
        int result = stringToInt.myAtoi(str);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Result: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}