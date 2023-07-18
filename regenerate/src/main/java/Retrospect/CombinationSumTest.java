package Retrospect;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CombinationSumTest {

    @Test
    public void testCombinationSum2() {
        // 测试用例
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        CombinationSum combinationSum = new CombinationSum();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 执行方法
        List<List<Integer>> result = combinationSum.combinationSum2(candidates, target);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证结果
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 1, 6),
                Arrays.asList(1, 2, 5),
                Arrays.asList(1, 7),
                Arrays.asList(2, 6)
        );

        // 对 expected 和 result 中的每个列表进行排序
        for (List<Integer> list : expected) {
            Collections.sort(list);
        }
        for (List<Integer> list : result) {
            Collections.sort(list);
        }

        assertEquals(expected.size(), result.size());
        for (List<Integer> list : expected) {
            assertTrue(result.contains(list));
        }
    }
}