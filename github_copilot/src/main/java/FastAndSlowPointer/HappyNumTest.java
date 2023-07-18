package FastAndSlowPointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumTest {
    @Test
    public void testIsHappy() {
        HappyNum happyNum = new HappyNum();

        int n = 19;

        boolean expected = true;

        long startTime = System.nanoTime();
        boolean result = happyNum.isHappy(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Is Happy Number: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}