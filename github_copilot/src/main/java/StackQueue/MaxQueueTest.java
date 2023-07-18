package StackQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxQueueTest {
    @Test
    public void testMaxQueue() {
        MaxQueue maxQueue = new MaxQueue();

        // 测试用例1
        maxQueue.push_back(1);
        maxQueue.push_back(3);
        maxQueue.push_back(2);
        long startTime1 = System.nanoTime();
        assertEquals(3, maxQueue.max_value());
        long endTime1 = System.nanoTime();

        long duration1 = endTime1 - startTime1;
        System.out.println("运行时间1: " + duration1 + "纳秒");

        long startTime2 = System.nanoTime();
        assertEquals(1, maxQueue.pop_front());
        long endTime2 = System.nanoTime();

        long duration2 = endTime2 - startTime2;
        System.out.println("运行时间2: " + duration2 + "纳秒");

        long startTime3 = System.nanoTime();
        assertEquals(3, maxQueue.max_value());
        long endTime3 = System.nanoTime();

        long duration3 = endTime3 - startTime3;
        System.out.println("运行时间3: " + duration3 + "纳秒");
    }
}