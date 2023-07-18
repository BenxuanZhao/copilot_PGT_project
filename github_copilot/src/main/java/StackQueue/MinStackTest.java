package StackQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();

        // 测试用例1
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        long startTime1 = System.nanoTime();
        assertEquals(2, minStack.getMin());
        long endTime1 = System.nanoTime();

        long duration1 = endTime1 - startTime1;
        System.out.println("运行时间1: " + duration1 + "纳秒");

        long startTime2 = System.nanoTime();
        assertEquals(5, minStack.top());
        long endTime2 = System.nanoTime();

        long duration2 = endTime2 - startTime2;
        System.out.println("运行时间2: " + duration2 + "纳秒");

        long startTime3 = System.nanoTime();
        minStack.pop();
        assertEquals(2, minStack.getMin());
        long endTime3 = System.nanoTime();

        long duration3 = endTime3 - startTime3;
        System.out.println("运行时间3: " + duration3 + "纳秒");
    }
}