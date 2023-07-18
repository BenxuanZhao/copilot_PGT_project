package FastAndSlowPointer;

import Partitioning.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleNodeTest {
    @Test
    public void testMiddleNode() {
        MiddleNode middleNode = new MiddleNode();

        // Create a linked list for testing
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode expected = node3;

        long startTime = System.nanoTime();
        ListNode result = middleNode.middleNode(head);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Middle Node: " + result.val);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}