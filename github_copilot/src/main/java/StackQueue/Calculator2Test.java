package StackQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2Test {
    @Test
    public void testCalculate() {
        Calculator2 calculator = new Calculator2();

        // 测试用例1
        String s1 = "1 + 2";
        int expected1 = 3;
        long startTime1 = System.nanoTime();
        int result1 = calculator.calculate(s1);
        long endTime1 = System.nanoTime();
        assertEquals(expected1, result1);
        System.out.println("运行时间1: " + (endTime1 - startTime1) + "纳秒");

        // 测试用例2
        String s2 = "3 - 2 - 4";
        int expected2 = -3;
        long startTime2 = System.nanoTime();
        int result2 = calculator.calculate(s2);
        long endTime2 = System.nanoTime();
        assertEquals(expected2, result2);
        System.out.println("运行时间2: " + (endTime2 - startTime2) + "纳秒");

        // 测试用例3
        String s3 = "5 + (6 - 3) - 2";
        int expected3 = 6;
        long startTime3 = System.nanoTime();
        int result3 = calculator.calculate(s3);
        long endTime3 = System.nanoTime();
        assertEquals(expected3, result3);
        System.out.println("运行时间3: " + (endTime3 - startTime3) + "纳秒");

        // 测试用例4
        String s4 = "(1 + 2) - 3";
        int expected4 = 0;
        long startTime4 = System.nanoTime();
        int result4 = calculator.calculate(s4);
        long endTime4 = System.nanoTime();
        assertEquals(expected4, result4);
        System.out.println("运行时间4: " + (endTime4 - startTime4) + "纳秒");
    }
}