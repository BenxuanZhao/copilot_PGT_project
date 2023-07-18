package hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharTest {
    @Test
    public void testFirstUniqChar() {
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();

        String s = "leetcode";

        int expected = 0;

        long startTime = System.nanoTime();
        int result = firstUniqueChar.firstUniqChar(s);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("First Unique Character Index: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}