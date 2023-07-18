package ListOperation;

import Partitioning.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNNodeFromEndTest {
    @Test
    public void testRemoveNthFromEnd() {
        // 创建链表
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        DeleteNNodeFromEnd deleteNNodeFromEnd = new DeleteNNodeFromEnd();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 删除倒数第二个节点
        ListNode result = deleteNNodeFromEnd.removeNthFromEnd(head, 2);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证结果是否正确
        int[] expected = {1, 2, 3, 5};
        int i = 0;
        while (result != null) {
            assertEquals(expected[i++], result.val);
            result = result.next;
        }
    }
}