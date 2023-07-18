package FastAndSlowPointer;

import Partitioning.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleListTest {
    @Test
    public void testHasCycle() {
        CircleList circleList = new CircleList();

        // Create a cyclic linked list for testing
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2; // Create a cycle

        boolean expected = true;

        long startTime = System.nanoTime();
        boolean result = circleList.hasCycle(head);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Has Cycle: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}