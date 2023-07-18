package FastAndSlowPointer;

import Partitioning.ListNode;

public class MiddleNode {
    /* Here is the explanation for the code above:
1. we have a slow and fast pointer starting from head.
2. we move slow pointer one step at a time and fast pointer two steps at a time.
3. when fast reaches the end, slow will be at the middle. */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) { // fast != null && fast.next != null
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
