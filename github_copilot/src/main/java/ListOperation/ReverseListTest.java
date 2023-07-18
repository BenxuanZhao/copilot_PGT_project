package ListOperation;

import Partitioning.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    @Test
    public void testReverseList() {
        // Create an instance of the ReverseList
        ReverseList reverseList = new ReverseList();

        // Create a linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Run the reverseList method and measure its execution time
        long startTime = System.nanoTime();
        ListNode reversedHead = reverseList.reverseList(head);
        long endTime = System.nanoTime();

        // Check the reversed linked list
        assertEquals(4, reversedHead.val);
        assertEquals(3, reversedHead.next.val);
        assertEquals(2, reversedHead.next.next.val);
        assertEquals(1, reversedHead.next.next.next.val);

        // Print out the execution time
        System.out.println("Execution time: " + (endTime - startTime) + " ns");
    }
}