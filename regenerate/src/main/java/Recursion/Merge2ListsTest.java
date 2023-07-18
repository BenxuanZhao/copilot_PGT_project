package Recursion;

import Partitioning.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Merge2ListsTest {
    @Test
    public void testMergeTwoLists() {
        // 构造测试用例
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // 创建待测试的对象
        Merge2Lists merge2Lists = new Merge2Lists();

        // 合并两个有序链表
        long startTime = System.nanoTime();
        ListNode merged = merge2Lists.mergeTwoLists(l1, l2);
        long endTime = System.nanoTime();

        // 验证合并结果
        assertEquals(1, merged.val);
        assertEquals(1, merged.next.val);
        assertEquals(2, merged.next.next.val);
        assertEquals(3, merged.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.next.val);

        // 打印运行时间
        System.out.println("运行时间: " + (endTime - startTime) + "纳秒");
    }

}