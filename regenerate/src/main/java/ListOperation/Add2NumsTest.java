package ListOperation;

import Partitioning.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Add2NumsTest {
    @Test
    public void testAddTwoNumbers() {
        // 创建两个链表
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Add2Nums add2Nums = new Add2Nums();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 添加两个数字
        ListNode result = add2Nums.addTwoNumbers(l1, l2);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证结果是否正确
        int[] expected = {7, 0, 8};
        int i = 0;
        while (result != null) {
            assertEquals(expected[i++], result.val);
            result = result.next;
        }
    }
}