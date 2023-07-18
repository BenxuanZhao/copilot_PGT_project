package Retrospect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {
    @Test
    public void testIsMatch() {
        RegularExpressionMatching regexMatching = new RegularExpressionMatching();

        // 测试用例1
        String text1 = "aa";
        String pattern1 = "a";
        boolean expected1 = false;
        long startTime1 = System.nanoTime();
        boolean result1 = regexMatching.isMatch(text1, pattern1);
        long endTime1 = System.nanoTime();
        assertEquals(expected1, result1);
        System.out.println("运行时间1: " + (endTime1 - startTime1) + "纳秒");

        // 测试用例2
        String text2 = "aa";
        String pattern2 = "a*";
        boolean expected2 = true;
        long startTime2 = System.nanoTime();
        boolean result2 = regexMatching.isMatch(text2, pattern2);
        long endTime2 = System.nanoTime();
        assertEquals(expected2, result2);
        System.out.println("运行时间2: " + (endTime2 - startTime2) + "纳秒");

        // 测试用例3
        String text3 = "ab";
        String pattern3 = ".*";
        boolean expected3 = true;
        long startTime3 = System.nanoTime();
        boolean result3 = regexMatching.isMatch(text3, pattern3);
        long endTime3 = System.nanoTime();
        assertEquals(expected3, result3);
        System.out.println("运行时间3: " + (endTime3 - startTime3) + "纳秒");

        // 测试用例4
        String text4 = "aab";
        String pattern4 = "c*a*b";
        boolean expected4 = true;
        long startTime4 = System.nanoTime();
        boolean result4 = regexMatching.isMatch(text4, pattern4);
        long endTime4 = System.nanoTime();
        assertEquals(expected4, result4);
        System.out.println("运行时间4: " + (endTime4 - startTime4) + "纳秒");
    }
}