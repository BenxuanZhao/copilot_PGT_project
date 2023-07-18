package NumOperation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumOfRepliesTest {
    @Test
    public void testIsPalindrome() {
        NumOfReplies isPalindrome = new NumOfReplies();

        int x1 = 12321;
        int x2 = 12345;

        boolean expected1 = true;
        boolean expected2 = false;

        long startTime1 = System.nanoTime();
        boolean result1 = isPalindrome.isPalindrome(x1);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);

        long startTime2 = System.nanoTime();
        boolean result2 = isPalindrome.isPalindrome(x2);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        Assertions.assertEquals(expected1, result1);
        Assertions.assertEquals(expected2, result2);
        System.out.println("Result 1: " + result1);
        System.out.println("Execution time 1: " + duration1 + " nanoseconds");
        System.out.println("Result 2: " + result2);
        System.out.println("Execution time 2: " + duration2 + " nanoseconds");
    }
}