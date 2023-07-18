package StackQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidBracketsTest {
    @Test
    public void testIsValid() {
        ValidBrackets validBrackets = new ValidBrackets();

        // 输入测试数据
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        // 执行代码并测量运行时间
        long startTime = System.nanoTime();
        boolean result1 = validBrackets.isValid(s1);
        boolean result2 = validBrackets.isValid(s2);
        boolean result3 = validBrackets.isValid(s3);
        boolean result4 = validBrackets.isValid(s4);
        boolean result5 = validBrackets.isValid(s5);
        long endTime = System.nanoTime();

        // 验证结果
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
        assertTrue(result5);

        // 输出运行时间
        long duration = endTime - startTime;
        System.out.println("运行时间: " + duration + "纳秒");
    }
}