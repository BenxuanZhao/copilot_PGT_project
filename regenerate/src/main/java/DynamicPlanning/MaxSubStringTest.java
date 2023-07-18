package DynamicPlanning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxSubStringTest {
    @Test
    public void testLongestCommonSubsequence() {
        MaxSubString maxSubString = new MaxSubString();

        String text1 = "abcde";
        String text2 = "ace";

        int expected = 3;

        long startTime = System.nanoTime();
        int result = maxSubString.longestCommonSubsequence(text1, text2);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Longest Common Subsequence Length: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}