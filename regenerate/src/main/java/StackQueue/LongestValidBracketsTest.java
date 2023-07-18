//package StackQueue;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class LongestValidBracketsTest {
//    @Test
//    public void testLongestValidParentheses() {
//        LongestValidBrackets brackets = new LongestValidBrackets();
//
//        // 测试用例1
//        String s1 = "(()";
//        int expected1 = 2;
//        long startTime1 = System.nanoTime();
//        int result1 = brackets.longestValidParentheses(s1);
//        long endTime1 = System.nanoTime();
//        assertEquals(expected1, result1);
//        System.out.println("运行时间1: " + (endTime1 - startTime1) + "纳秒");
//
//        // 测试用例2
//        String s2 = ")()())";
//        int expected2 = 4;
//        long startTime2 = System.nanoTime();
//        int result2 = brackets.longestValidParentheses(s2);
//        long endTime2 = System.nanoTime();
//        assertEquals(expected2, result2);
//        System.out.println("运行时间2: " + (endTime2 - startTime2) + "纳秒");
//
//        // 测试用例3
//        String s3 = "";
//        int expected3 = 0;
//        long startTime3 = System.nanoTime();
//        int result3 = brackets.longestValidParentheses(s3);
//        long endTime3 = System.nanoTime();
//        assertEquals(expected3, result3);
//        System.out.println("运行时间3: " + (endTime3 - startTime3) + "纳秒");
//    }
//}