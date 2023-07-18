package Retrospect;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BracketsTest {
    @Test
    public void testGenerateParenthesis() {
        int n = 3;
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");

        Brackets brackets = new Brackets();
        long startTime = System.nanoTime();
        List<String> result = brackets.generateParenthesis(n);
        long endTime = System.nanoTime();

        assertEquals(expected, result);
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");
    }
}