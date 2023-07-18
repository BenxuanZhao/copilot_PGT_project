package ListOperation;

import Partitioning.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetIntersectionNodeTest {
    @Test
    public void testGetIntersectionNode() {
        // 创建链表节点
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        GetIntersectionNode getIntersectionNode = new GetIntersectionNode();

        // 获取开始时间
        long startTime = System.nanoTime();

        // 执行方法
        ListNode result = getIntersectionNode.getIntersectionNode(headA, headB);

        // 获取结束时间
        long endTime = System.nanoTime();

        // 计算运行时间
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");

        // 验证结果
        assertEquals(common, result);
    }
}