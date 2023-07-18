package StackQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateLettersTest {
    @Test
    public void testRemoveDuplicateLetters() {
        RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();

        // 输入测试数据
        String s = "bcabc";

        // 执行代码并测量运行时间
        long startTime = System.nanoTime();
        String result = removeDuplicateLetters.removeDuplicateLetters(s);
        long endTime = System.nanoTime();

        // 验证结果
        assertEquals("abc", result);

        // 输出运行时间
        long duration = endTime - startTime;
        System.out.println("运行时间: " + duration + "纳秒");
    }
}