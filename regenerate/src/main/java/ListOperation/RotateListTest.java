package ListOperation;

import Partitioning.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateListTest {
    @Test
    public void testRotateRight() {
        RotateList solution = new RotateList();

        // 创建链表：1->2->3->4->5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        // k=2，预期输出：4->5->1->2->3
        ListNode result1 = solution.rotateRight(head1, 2);
        assertEquals(4, result1.val);
        assertEquals(5, result1.next.val);
        assertEquals(1, result1.next.next.val);
        assertEquals(2, result1.next.next.next.val);
        assertEquals(3, result1.next.next.next.next.val);

        // 创建链表：0->1->2
        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);

        // k=4，预期输出：2->0->1
        ListNode result2 = solution.rotateRight(head2, 4);
        assertEquals(2, result2.val);
        assertEquals(0, result2.next.val);
        assertEquals(1, result2.next.next.val);
    }
}